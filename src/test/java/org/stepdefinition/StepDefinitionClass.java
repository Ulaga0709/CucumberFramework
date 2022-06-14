package org.stepdefinition;

import org.base.HelperClass;
import org.pjosample.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass extends HelperClass {

	@Given("Users in Login Page")
	public void usersInLoginPage() {
		impiWait();
	}

	@When("Users Enter the Invalid {string} and Invalid {string}")
	public void usersEnterTheInvalidAndInvalid(String Username, String Password) {
		PojoClass l=new PojoClass();
	    toText(l.getEmail(), Username);
	    toText(l.getPass(), Password);
	}

	@When("Users Click the Login Button")
	public void usersClickTheLoginButton() {
		PojoClass l=new PojoClass();
	    btnClick(l.getLognButton());
	}

	@When("User Print the message")
	public void userPrintTheMessage() {
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
	}

	@Then("Users checking the Url and Title of the Webpage")
	public void usersCheckingTheUrlAndTitleOfTheWebpage() {
	    String title = driver.getTitle();
	 
	    System.out.println(title);
	}
	
	@When("User click the forgot password link")
	public void userClickTheForgotPasswordLink() {
	   PojoClass p= new PojoClass();
	   btnClick(p.getForgottenPasword());
	}

	@When("User ente the {string}")
	public void userEnteThe(String Phnonenumber) {
		PojoClass p = new PojoClass();
		toText(p.getMobileNumber(), Phnonenumber);
	    
	}

	@Then("User click the search button")
	public void userClickTheSearchButton() {
		PojoClass p = new PojoClass();
		btnClick(p.getClickSearch());	
	}
	   

	
}
