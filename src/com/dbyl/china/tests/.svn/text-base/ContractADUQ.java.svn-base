package com.dbyl.china.tests;

import org.testng.annotations.Test;

import com.dbyl.libarary.china.pageAction.ClientOwner;
import com.dbyl.libarary.china.pageAction.Contract;
import com.dbyl.libarary.china.pageAction.LoginPage;
import com.dbyl.libarary.china.pageAction.Organization;
import com.dbyl.libarary.utils.QueryData;
import com.dbyl.libarary.china.pageAction.Client;
import com.dbyl.malay.envpars.DBEnv;
import com.dbyl.malay.envpars.SetInitEnv;

import org.testng.annotations.BeforeMethod;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ContractADUQ {
  @Test
  public void ContractManage() throws InterruptedException, SQLException {
	  SetInitEnv se = new SetInitEnv();
	  int env = se.SIT();
      DBEnv dbinitenv = new DBEnv();
      String strUrl = dbinitenv.envDB(env,0).get("strUrlP");
      String strUser = dbinitenv.envDB(env,0).get("strUserP");
      String strPwd = dbinitenv.envDB(env,0).get("strPwdP");
      //String strLoginq = se.envParameters().get("strLoginqP");
	  String strLoginq = "pancs_owner";
	  WebDriver driver = se.FirefoxDriver();
	  driver = se.envchoicePartner(env, driver);
	  LoginPage lp = new LoginPage();
	  lp.LoginPartner(strLoginq, "123456", driver);
      Thread.sleep(2000);
      //Assert.assertEquals(driver.findElement(By.xpath("//a[@class = 'user-name']")).getText(),strLoginq);
      SimpleDateFormat df = new SimpleDateFormat("MMddHHmm");
      String strtime = df.format(new Date());
      String strphone = "158"+strtime;
      ClientOwner co = new ClientOwner();
      String strowner = co.ownerAdd(driver, strtime, strphone);
      Organization og = new Organization();
      String strOrg = og.OrgSelect(driver);
      Client ct = new Client();
      String corpName = ct.ClientCreate(driver, strowner, strtime, strOrg, strLoginq,strUrl,strUser,strPwd);
      Contract ctt = new Contract();
      QueryData qd = new QueryData();
      ctt.ContractCreate(driver, corpName);      
      String ContractID = qd.QueryClientID(strUrl, strUser, strPwd, corpName);
      System.out.println("企业名称："+corpName);
      System.out.println("合同ID："+ContractID);
      Thread.sleep(2000);
      ctt.ContractEdit(driver, corpName, ContractID);
      String ContractCode = qd.QueryOrderID(strUrl, strUser, strPwd, corpName);
      //ctt.ContractCancel(driver, corpName, ContractCode);     
      ctt.ContractCreateZHUCHE(driver, corpName);
      ContractCode = qd.QueryOrderID(strUrl, strUser, strPwd, corpName);
      ContractID = qd.QueryClientID(strUrl, strUser, strPwd, corpName);
      ctt.ContractPay(driver, corpName, ContractCode,ContractID);
      driver.quit();          
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
