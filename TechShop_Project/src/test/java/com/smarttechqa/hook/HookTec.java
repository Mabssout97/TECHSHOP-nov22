package com.smarttechqa.hook;

import java.io.IOException;

import com.smarttechqa.base.BaseClassTec;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookTec extends BaseClassTec {

	
	
		//Initialize starts the browser before every scenario
		@Before
		public static void initialize() throws IOException {
			BaseClassTec.setUp();	
		}
		
		//tearDown will quit the browser after every scenario
		@After
		public static void tearDown() {
			driver.quit();
			
		}	
	
	
	
	
	
	
	
	
}
