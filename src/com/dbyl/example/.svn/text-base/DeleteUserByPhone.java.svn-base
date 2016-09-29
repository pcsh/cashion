package com.dbyl.example;

import org.testng.annotations.Test;

import com.dbyl.libarary.utils.QueryData;

import org.testng.annotations.BeforeMethod;

import java.sql.SQLException;

import org.testng.annotations.AfterMethod;

public class DeleteUserByPhone {
  @Test
  public void deleteUserByPhone() throws SQLException {
	  QueryData qd = new QueryData();
	  String sql_vop ="delete from t_vop_ssm_user "
			  +"where name = '15880276011' or mobile_phone_no = '15880276011'";
	  String sql_onlyou="delete from t_onlyou_user "
			  +"where name = '15880276011' or mobile_phone_no = '15880276011'";
      qd.DeleteData("jdbc:postgresql://172.16.11.35:5432/vop_accounting_uat", "vop_uat", "vop_uat", sql_vop);
      qd.DeleteData("jdbc:postgresql://172.16.11.35:5432/onlyou_uat", "onlyou_uat", "onlyou_uat", sql_onlyou);

  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
