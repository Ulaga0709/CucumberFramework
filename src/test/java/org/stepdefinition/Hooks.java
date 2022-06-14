package org.stepdefinition;

import org.base.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends HelperClass {
	
	@Before
	public static void beforeClass() {
		System.out.println("Scenario Started.......!");
		launchBrowser();
		maxBrowser();
		loadUrl("https://www.facebook.com/");
	
	}
	
	@After
	public void afterClass() {
		driver.close();
		System.out.println("Scenarion Ended....!");
	}

}
