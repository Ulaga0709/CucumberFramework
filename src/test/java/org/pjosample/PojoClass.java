package org.pjosample;

import org.base.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends HelperClass {
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement lognButton;
	
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement CreatNewAccount;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement fristname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement RegEmail;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement newpassword;
	
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement birthdayDay;
	
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement birthdayMonth;
	
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement birthdayYear;
	
	@FindBy(xpath="//input[@id='u_d_4_mE']")
	private WebElement femalegender;
	
	@FindBy(xpath="//input[@id='u_d_5_OU']")
	private WebElement malegender;
	
	@FindBy(xpath="//input[@id='u_d_6_0R']")
	private WebElement customgender;
	
	@FindBy(xpath="//select[@name='preferred_pronoun']")
	private WebElement selectpreferredpronoun;
	
	@FindBy(xpath="//input[@name='custom_gender']")
	private WebElement customgendername;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement createaccount;
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement ForgottenPasword;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	private WebElement MobileNumber;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement ClickSearch;

	/**
	 * @return the email
	 */
	public WebElement getEmail() {
		return email;
	}

	/**
	 * @return the pass
	 */
	public WebElement getPass() {
		return pass;
	}

	/**
	 * @return the lognButton
	 */
	public WebElement getLognButton() {
		return lognButton;
	}

	/**
	 * @return the creatNewAccount
	 */
	public WebElement getCreatNewAccount() {
		return CreatNewAccount;
	}

	/**
	 * @return the fristname
	 */
	public WebElement getFristname() {
		return fristname;
	}

	/**
	 * @return the lastname
	 */
	public WebElement getLastname() {
		return lastname;
	}

	/**
	 * @return the regEmail
	 */
	public WebElement getRegEmail() {
		return RegEmail;
	}

	/**
	 * @return the newpassword
	 */
	public WebElement getNewpassword() {
		return newpassword;
	}

	/**
	 * @return the birthdayDay
	 */
	public WebElement getBirthdayDay() {
		return birthdayDay;
	}

	/**
	 * @return the birthdayMonth
	 */
	public WebElement getBirthdayMonth() {
		return birthdayMonth;
	}

	/**
	 * @return the birthdayYear
	 */
	public WebElement getBirthdayYear() {
		return birthdayYear;
	}

	/**
	 * @return the femalegender
	 */
	public WebElement getFemalegender() {
		return femalegender;
	}

	/**
	 * @return the malegender
	 */
	public WebElement getMalegender() {
		return malegender;
	}

	/**
	 * @return the customgender
	 */
	public WebElement getCustomgender() {
		return customgender;
	}

	/**
	 * @return the selectpreferredpronoun
	 */
	public WebElement getSelectpreferredpronoun() {
		return selectpreferredpronoun;
	}

	/**
	 * @return the customgendername
	 */
	public WebElement getCustomgendername() {
		return customgendername;
	}

	/**
	 * @return the createaccount
	 */
	public WebElement getCreateaccount() {
		return createaccount;
	}

	/**
	 * @return the forgottenPasword
	 */
	public WebElement getForgottenPasword() {
		return ForgottenPasword;
	}

	/**
	 * @return the mobileNumber
	 */
	public WebElement getMobileNumber() {
		return MobileNumber;
	}

	/**
	 * @return the clickSearch
	 */
	public WebElement getClickSearch() {
		return ClickSearch;
	}
	
}
