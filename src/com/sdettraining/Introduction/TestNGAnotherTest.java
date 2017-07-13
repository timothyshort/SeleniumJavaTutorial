package com.sdettraining.Introduction;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNGAnotherTest {
	
	
  @Test
  public void f() {
	  System.out.println("Running another test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Running before another test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Running after another test");
  }

}
