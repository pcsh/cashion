package com.dbyl.example;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.dbyl.libarary.utils.Assertion;

@Listeners({com.dbyl.libarary.utils.AssertionListener.class})
public class AssertionTest {
  @Test
  public void testAssert3() {
	  Assertion.verifyEquals(2, 3,"比较两个数是否相等：");
	  Assertion.verifyEquals(1, 2, "比较两个数是否相等：");
  }
  
  @Test
  public void testAssert4(){
	  Assertion.verifyEquals(3, 3,"比较两个数是否相等：");
	  Assertion.verifyEquals(2, 2, "比较两个数是否相等：");
  } 
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
