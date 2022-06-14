package org.pojoHotel;

import org.base.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HotelBooking extends HelperClass{
	public HotelBooking() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")
	private WebElement Username;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id= "login")
	private WebElement loginButton;
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement selectCity;
	
	@FindBy(name="hotels")
	private WebElement selectHotels;
	
	@FindBy(name="room_type")
	private WebElement roomType;
	
	@FindBy(name="room_nos")
	private WebElement numberOfRooms;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkIn;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkOut;
	
	@FindBy(name="adult_room")
	private WebElement adults;
	
	@FindBy(name="child_room")
	private WebElement childRoom;
	
	@FindBy(name="Submit")
	private WebElement submit;
	
	@FindBy(id="radiobutton_0")
	private WebElement Select1;
	
	@FindBy(id="continue")
	private WebElement Continue;
	
	@FindBy(id="first_name")
	private WebElement FirstName;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(name="address")
	private WebElement Address;
	
	@FindBy(name="cc_num")
	private WebElement CardName;
	
	@FindBy(name="cc_type")
	private WebElement Cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement ExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ExpYear;
	
	@FindBy(name="cc_cvv")
	private WebElement CVV;
	
	@FindBy(name="book_now")
	private WebElement BookNow;
	
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement OrderId;
	

	/**
	 * @return the username
	 */
	public WebElement getUsername() {
		return Username;
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return Password;
	}

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return loginButton;
	}

	/**
	 * @return the selectCity
	 */
	public WebElement getSelectCity() {
		return selectCity;
	}

	/**
	 * @return the selectHotels
	 */
	public WebElement getSelectHotels() {
		return selectHotels;
	}

	/**
	 * @return the roomType
	 */
	public WebElement getRoomType() {
		return roomType;
	}

	/**
	 * @return the numberOfRooms
	 */
	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	/**
	 * @return the checkIn
	 */
	public WebElement getCheckIn() {
		return checkIn;
	}

	/**
	 * @return the checkOut
	 */
	public WebElement getCheckOut() {
		return checkOut;
	}

	/**
	 * @return the adults
	 */
	public WebElement getAdults() {
		return adults;
	}

	/**
	 * @return the childRoom
	 */
	public WebElement getChildRoom() {
		return childRoom;
	}

	/**
	 * @return the submit
	 */
	public WebElement getSubmit() {
		return submit;
	}

	/**
	 * @return the select1
	 */
	public WebElement getSelect1() {
		return Select1;
	}

	/**
	 * @return the continue
	 */
	public WebElement getContinue() {
		return Continue;
	}

	/**
	 * @return the firstName
	 */
	public WebElement getFirstName() {
		return FirstName;
	}

	/**
	 * @return the lastName
	 */
	public WebElement getLastName() {
		return LastName;
	}

	/**
	 * @return the address
	 */
	public WebElement getAddress() {
		return Address;
	}

	/**
	 * @return the cardName
	 */
	public WebElement getCardName() {
		return CardName;
	}

	/**
	 * @return the cardtype
	 */
	public WebElement getCardtype() {
		return Cardtype;
	}

	/**
	 * @return the expMonth
	 */
	public WebElement getExpMonth() {
		return ExpMonth;
	}

	/**
	 * @return the expYear
	 */
	public WebElement getExpYear() {
		return ExpYear;
	}

	/**
	 * @return the cVV
	 */
	public WebElement getCVV() {
		return CVV;
	}

	/**
	 * @return the bookNow
	 */
	public WebElement getBookNow() {
		return BookNow;
	}

	/**
	 * @return the orderId
	 */
	public WebElement getOrderId() {
		return OrderId;
	}

}
