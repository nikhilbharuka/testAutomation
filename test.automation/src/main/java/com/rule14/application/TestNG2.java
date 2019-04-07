package com.rule14.application;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNG2 {
  @Test
  public void f() {
	  System.out.println(" From Class2");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println(" From Class2 before");
  }

  @AfterTest
  public void afterTest() {
  }

}
