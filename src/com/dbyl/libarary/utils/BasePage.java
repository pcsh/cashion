package com.dbyl.libarary.utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BasePage {
    protected WebDriver driver;
    protected String[][] locatorMap;
    protected BasePage(WebDriver driver) throws IOException {
        this.driver = driver;
        System.out.println("获取Excel信息......");
        locatorMap = ReadExcelUtil.getLocatorMap();
    }
    protected void type(Locator locator, String values) throws Exception {
    	System.out.println("type中的值："+values);
    	System.out.println("定位中的元素信息："+locator.getElement());
    	WebElement e = driver.findElement(By.name(locator.getElement()));//findElement(driver, locator);
        System.out.println("当前元素信息......");
        System.out.println(e.getText());
        e.sendKeys(values);
    }
    protected void click(Locator locator) throws Exception {
    	System.out.println("定位中的元素信息："+locator.getBy());
        WebElement e = driver.findElement(By.id("submitBtn"));//findElement(driver, locator);
        e.click();
    }
    protected void clickAndHold(Locator locator) throws IOException {
        WebElement e = findElement(driver, locator);
        Actions actions = new Actions(driver);
        actions.clickAndHold(e).perform();
    }
    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getElement(Locator locator) throws IOException {
        return getElement(this.getDriver(), locator);
    }
    /**
     * get by parameter
     *
     * @author Young
     * @param driver
     * @param locator
     * @return
     * @throws IOException
     */
    public WebElement getElement(WebDriver driver, Locator locator)
            throws IOException {
        locator = getLocator(locator.getElement());
        WebElement e;
        switch (locator.getBy()) {
        case xpath:
            e = driver.findElement(By.xpath(locator.getElement()));
            break;
        case id:
            e = driver.findElement(By.id(locator.getElement()));
            break;
        case name:
            e = driver.findElement(By.name(locator.getElement()));
            break;
        case cssSelector:
            e = driver.findElement(By.cssSelector(locator.getElement()));
            break;
        case className:
            e = driver.findElement(By.className(locator.getElement()));
            break;
        case tagName:
            e = driver.findElement(By.tagName(locator.getElement()));
            break;
        case linkText:
            e = driver.findElement(By.linkText(locator.getElement()));
            break;
        case partialLinkText:
            e = driver.findElement(By.partialLinkText(locator.getElement()));
            break;
        default:
            e = driver.findElement(By.id(locator.getElement()));
        }
        return e;
    }
    public boolean isElementPresent(WebDriver driver, Locator myLocator,
            int timeOut) throws IOException {
        final Locator locator = getLocator(myLocator.getElement());
        boolean isPresent = false;
        WebDriverWait wait = new WebDriverWait(driver, 60);
        isPresent = wait.until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver d) {
                return findElement(d, locator);
            }
        }).isDisplayed();
        return isPresent;
    }
    /**
     * This Method for check isPresent Locator
     *
     * @param locator
     * @param timeOut
     * @return
     * @throws IOException
     */
    public boolean isElementPresent(Locator locator, int timeOut)
            throws IOException {
        return isElementPresent(driver,locator, timeOut);
    }
    /**
     *
     * @param driver
     * @param locator
     * @return
     */
    public WebElement findElement(WebDriver driver, final Locator locator) {
        WebElement element = (new WebDriverWait(driver, locator.getWaitSec()))
                .until(new ExpectedCondition<WebElement>() {
                    @Override
                    public WebElement apply(WebDriver driver) {
                        try {
                            return getElement(driver, locator);
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            return null;
                        }
                    }
                });
        return element;
    }
    public Locator getLocator(String locatorName) throws IOException {
        Locator locator;
        for (int i = 0; i < locatorMap.length; i++) {
            if (locatorMap[i][0].endsWith(locatorName)) {
                return locator = new Locator(locatorMap[i][1]);
            }
        }
        return locator = new Locator(locatorName);
    }
}
