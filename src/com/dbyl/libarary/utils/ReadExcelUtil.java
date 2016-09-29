package com.dbyl.libarary.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
public class ReadExcelUtil {
    static String path;
    /**
     * @author Young
     * @return
     * @throws IOException
     */
    public static String[][] getLocatorMap() throws IOException {
        path = "C:/Users/UILibrary.xls";
        File f1 = new File(path);
        FileInputStream in = new FileInputStream(f1);
        HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(in));
        Sheet sheet = wb.getSheetAt(0);
        Row header = sheet.getRow(0);
        String[][] locatorMap = new String[sheet.getLastRowNum() + 1][header
                .getLastCellNum()];
        for (int rownum = 0; rownum <= sheet.getLastRowNum(); rownum++) {
            // for (Cell cell : row)
            Row row = sheet.getRow(rownum);
            if (row == null) {
                continue;
            }
            String value;
            for (int cellnum = 0; cellnum <= row.getLastCellNum(); cellnum++) {
                Cell cell = row.getCell(cellnum);
                if (cell == null) {
                    continue;
                } else {
                    value = "";
                }
                switch (cell.getCellType()) {
                case Cell.CELL_TYPE_STRING:
                    value = cell.getRichStringCellValue().getString();
                    System.out.println("Excel中的值STRING:"+value);
                    break;
                case Cell.CELL_TYPE_NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        value = cell.getDateCellValue().toString();
                        System.out.println("Excel中的值NUMERIC:"+value);
                    } else {
                        value = Double.toString((int) cell
                                .getNumericCellValue());
                        System.out.println("Excel中的值NUMERIC:"+value);
                    }
                    break;
                case Cell.CELL_TYPE_BOOLEAN:
                    value = Boolean.toString(cell.getBooleanCellValue());
                    System.out.println("Excel中的值BOOLEAN:"+value);
                    break;
                case Cell.CELL_TYPE_FORMULA:
                    value = cell.getCellFormula().toLowerCase();
                    System.out.println("Excel中的值FORMULA:"+value);
                    break;
                default:
                    value = " ";
                    System.out.println("Excel中的值空:"+value);
                    System.out.println();
                }
                locatorMap[rownum][cellnum] = value;
                System.out.println("locatorMap值:"+value);
            }
        }
        in.close();
        return locatorMap;
    }
}
