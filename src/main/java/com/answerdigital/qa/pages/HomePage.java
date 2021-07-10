package com.answerdigital.qa.pages;

import com.answerdigital.qa.base.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase{
	
	
	//Defining Page Factory
	
	@FindBy(xpath="//a[contains(@class, 'logolink')]")
	WebElement AnswerLogo;
	
	
	@FindBy(xpath="//*[@id=\"t3-mainnav\"]/div/div[3]/div/ul/li[1]/a")
	WebElement OurServiceTab;
	
	@FindBy(xpath="//*[@id=\"t3-mainnav\"]/div/div[3]/div/ul/li[2]/a")
	WebElement OurWorkTab;
	
	
	@FindBy(xpath="//*[@id=\"t3-mainnav\"]/div/div[3]/div/ul/li[3]/a")
	WebElement CareerTab;
	
	@FindBy(xpath="//*[@id=\"t3-mainnav\"]/div/div[3]/div/ul/li[4]/a")
	WebElement AcademyTab;
	
	@FindBy(xpath="//*[@id=\"t3-mainnav\"]/div/div[3]/div/ul/li[5]/a")
	WebElement AboutUsTab;
	
	@FindBy(xpath="//*[@id=\"t3-mainnav\"]/div/div[3]/div/ul/li[6]/a")
	WebElement InsightsTab;
	
	@FindBy(xpath="//*[@id=\"t3-mainnav\"]/div/div[3]/div/ul/li[7]/a")
	WebElement ContactUsTab;
	
	
	
	//Initialising the page object:
	
	public HomePage() {
		
					
			PageFactory.initElements(driver,this);
			
	}
	
		
	public String validateHomePageTitle() {
		
		return driver.getTitle();
		
	}
	
	public boolean validateAnswerDigitalLogoImage() {
		
		return AnswerLogo.isDisplayed();
		
	}
	
	
    public boolean validateOurServiceImage() {
		
		return OurServiceTab.isDisplayed();
		
	}
    
    public OurServicesPage ClickOnOurServicesLink() {
    	OurServiceTab.click();
    	return new OurServicesPage();
    	
    }
    
    
    public OurWorkPage ClickOnOurWorkLink() {
    	OurWorkTab.click();
    	return new OurWorkPage();
    	
    }
     public CareersPage ClickOnCareersLink() {
    	 
    	 CareerTab.click();
    	 return new CareersPage();
     }
    
    
    public AcademyPage ClickOnAcademyLink() {
    	AcademyTab.click();
    	return new AcademyPage();
    	
    }
    
    
    public AboutUsPage ClickOnAboutUsLink() {
    	AboutUsTab.click();
    	return new AboutUsPage();
    	
    }
    
    public InsightPage ClickOnInsightLink() {
    	InsightsTab.click();
    	return new InsightPage();
    	
    }
        
    public ContactUsPage ClickOnContactsUsLink() {
    	ContactUsTab.click();
    	return new ContactUsPage();
    	
    }
    
   
	
	
	}
	
	