package com.smarttechqa.hook;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;

import com.smarttechqa.base.BaseClassTec;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookTec extends BaseClassTec {

	
	
		//Initialize starts the browser before every scenario
		@BeforeMethod
		public static void initialize() throws IOException {
			BaseClassTec.setUp();	
		}
		
		//tearDown will quit the browser after every scenario
		@AfterMethod
		public static void tearDown() {
			driver.quit();
			
		}	
	
	
	
	
	
	
	
	
}
