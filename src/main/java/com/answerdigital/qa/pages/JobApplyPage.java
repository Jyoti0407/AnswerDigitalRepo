package com.answerdigital.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.answerdigital.qa.base.TestBase;

public class JobApplyPage extends TestBase {
	
	@FindBy(id="ApplicantTitle")
	WebElement title;
	
	@FindBy(id="ApplicantFirstName")
	WebElement firstname;
	
	@FindBy(id="ApplicantSurname")
	WebElement lastname;
	
	@FindBy(id="ApplicantEmail")
	WebElement email;
	
	@FindBy(id="ApplicantStreet")
	WebElement address;
	
	@FindBy(id="ApplicantMunicipality")
	WebElement city;
	
	@FindBy(id="ApplicantPostcode")
	WebElement postcode;
	
	@FindBy(id="ApplicantMobileNumber")
	WebElement mobileNo;
	
	public JobApplyPage() {
		PageFactory.initElements(driver,this);
		
}

	public void verifyJobApplyPageDataEntry(String title1, String fname,String lname, String mail, String addr, String city1, String pcode, String mobno) throws Throwable {
	
	Select select=new Select(title);
	select.selectByVisibleText(title1);
	firstname.sendKeys(fname);
	lastname.sendKeys(lname);
	email.sendKeys(mail);
	address.sendKeys(addr);
	city.sendKeys(city1);
	postcode.sendKeys(pcode);
	mobileNo.sendKeys(mobno);
	
	Thread.sleep(5000);
}

}
