package com.dbyl.libarary.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryData {

	public String QueryOrderID(String url,String user,String pwd,String ClientName) throws SQLException{
		String ContractID = null;
		try{
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e){
			System.out.println("Where is your PostgreSQL JDBC Driver?"
					+"Include in your library path!");
			e.printStackTrace();
			System.exit(0);			
		}
		Connection connection = null;

		System.out.println("Failed to make connection!");
		return ContractID;
	}
	
	public String QueryClientID(String url,String user,String pwd,String ClientName) throws SQLException{
		String ContractID = null;
		try{
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e){
			System.out.println("Where is your PostgreSQL JDBC Driver?"
					+"Include in your library path!");
			e.printStackTrace();
			System.exit(0);			
		}
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(url,user,pwd);
					//"jdbc:postgresql://172.16.125.150:5432/onlyou3", "onlyyou","onlyyou-test");

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			System.exit(0);
		}

		if (connection != null) {
			//System.out.println("You made it, take control your database now!");
	          Statement st = (Statement) connection.createStatement();
	           String sql = "select id from t_vop_ord_order where corp_id in (select corp.id from t_vop_cor_corp as corp where corp.name = '"+ClientName+"') ORDER BY create_ts DESC limit 1";
	        		   //"select ordernum from t_order where customerid in(select tc.customerid from t_customer tc where tc.userid in (select t.userid from t_user t where t.mpnumber = '"+mpnumber+"')) ORDER BY createtime DESC limit 1" ;
	           ResultSet rs = ((java.sql.Statement) st).executeQuery(sql);
	            while (rs.next())
	            {
	               //System.out.print(rs.getString(1));
	               //System.out.println(rs.getString(2));
	            	ContractID = rs.getString(1);
	           }            
	         //  rs.close();
	         //  st.close();
		} else {
			System.out.println("Failed to make connection!");
		}
		return ContractID;
	}
	
	public String UserID(String url,String user,String pwd,String UserName) throws SQLException{
		String UID = null;
		try{
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e){
			System.out.println("Where is your PostgreSQL JDBC Driver?"
					+"Include in your library path!");
			e.printStackTrace();
			System.exit(0);			
		}
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(url,user,pwd);
					//"jdbc:postgresql://172.16.125.150:5432/onlyou3", "onlyyou","onlyyou-test");

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			System.exit(0);
		}

		if (connection != null) {
			//System.out.println("You made it, take control your database now!");
	          Statement st = (Statement) connection.createStatement();
	           String sql = "select id from t_vop_ssm_user where name = '"+UserName+"' ORDER BY create_ts DESC limit 1";
	        		   //"select ordernum from t_order where customerid in(select tc.customerid from t_customer tc where tc.userid in (select t.userid from t_user t where t.mpnumber = '"+mpnumber+"')) ORDER BY createtime DESC limit 1" ;
	           ResultSet rs = ((java.sql.Statement) st).executeQuery(sql);
	            while (rs.next())
	            {
	               //System.out.print(rs.getString(1));
	               //System.out.println(rs.getString(2));
	            	UID = rs.getString(1);
	           }            
	         //  rs.close();
	         //  st.close();
		} else {
			System.out.println("Failed to make connection!");
		}
		return UID;
	}
	
	public void DeleteData(String url,String user,String pwd,String sql) throws SQLException{
		String NewOrderNum = null;
		try {
		 
		Class.forName("org.postgresql.Driver");

	} catch (ClassNotFoundException e) {

		System.out.println("Where is your PostgreSQL JDBC Driver? "
				+ "Include in your library path!");
		e.printStackTrace();
		System.exit(0);
	}

	//System.out.println("PostgreSQL JDBC Driver Registered!");

	Connection connection = null;

	try {

		connection = DriverManager.getConnection(url,user,pwd);
				//"jdbc:postgresql://172.16.125.150:5432/onlyou3", "onlyyou","onlyyou-test");

	} catch (SQLException e) {

		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		System.exit(0);
	}

	if (connection != null) {
		//System.out.println("You made it, take control your database now!");
         // Statement st = connection.createStatement();
           /*String sql = "update t_customer "
           		+ "set name = 'Dxpzxo/ROYKGezftS5gTkYRsOVUg+/OPNQwS3aU94Uab/J5QIWfo2g=='"
           		+ "where branchid in ( select b.branchid from t_branch b left JOIN t_user_branch ub on ub.branchid = b.branchid LEFT JOIN t_user u on u.userid = ub.userid "
           		+ "where u.reserved6 = (select reserved6 from t_user where mpnumber = '"+mpnumber+"'));" ;*/
           connection.prepareStatement(sql).execute();
         //  rs.close();
         //  st.close();
	} else {
		System.out.println("Failed to make connection!");
	}
}
	
}
