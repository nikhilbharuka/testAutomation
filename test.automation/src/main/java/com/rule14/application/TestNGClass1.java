package com.rule14.application;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

public class TestNGClass1 {
	@Parameters({"Browser"})
  @Test
  public void f(String Browser) {
	  
	  System.out.println(Browser);
	  System.out.println("i am from Test");
	 // System.out.println(Username);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("i am from Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("i am from After method");
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println(" i am from After Class");
  }

  @BeforeSuite
  public void beforeSuite() {
  }

}
