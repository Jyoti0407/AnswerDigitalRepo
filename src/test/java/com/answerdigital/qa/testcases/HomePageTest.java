package com.answerdigital.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.answerdigital.qa.base.TestBase;
import com.answerdigital.qa.pages.AboutUsPage;
import com.answerdigital.qa.pages.AcademyPage;
import com.answerdigital.qa.pages.CareersPage;
import com.answerdigital.qa.pages.ContactUsPage;
import com.answerdigital.qa.pages.HomePage;
import com.answerdigital.qa.pages.InsightPage;
import com.answerdigital.qa.pages.OurServicesPage;
import com.answerdigital.qa.pages.OurWorkPage;


public class HomePageTest extends TestBase {
	HomePage homepage;
	OurServicesPage ourservicesPage;
	OurWorkPage ourworkPage;
	CareersPage careersPage;
	AcademyPage academyPage;
	AboutUsPage aboutusPage;
	InsightPage insightPage;
	ContactUsPage contactusPage;

	
	
	public HomePageTest() throws IOException {
		super();
	}

	
	@BeforeMethod
	public void setUp() throws Throwable {
		
		initialization();
		homepage = new HomePage();
		ourservicesPage = new OurServicesPage();
		ourworkPage = new OurWorkPage();
		careersPage = new CareersPage();
		academyPage= new AcademyPage();
		aboutusPage = new AboutUsPage();
		insightPage = new InsightPage();	
		contactusPage = new ContactUsPage();
		
		
		
		 
	}
	
	@Test(priority=1)
	public void HomePageTitleTest() {
		String title=homepage.validateHomePageTitle();
		Assert.assertEquals(title, "Answer Digital | Award winning UK Digital Transformation company");
	}
	
	
	@Test(priority=2)
	public void AnswerDigitalLogoImageTest() {
		boolean flag=homepage.validateAnswerDigitalLogoImage();
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=3)
	public void VerifyOurServicesLinkTest() {
		
		ourservicesPage=homepage.ClickOnOurServicesLink();
		
	}
	
	@Test(priority=4)
	public void VerifyOurWorkLinkTest() {
		
		ourworkPage=homepage.ClickOnOurWorkLink();
	}
	
	@Test(priority=5)
	public void VerifyCareerLinkTest() {
		
		careersPage= homepage.ClickOnCareersLink();
	}
	

	@Test(priority=6)
	public void VerifyAcademyLinkTest() {
		
		academyPage= homepage.ClickOnAcademyLink();
	}
	
	

	@Test(priority=7)
	public void VerifyAboutUsLinkTest() {
		
		aboutusPage= homepage.ClickOnAboutUsLink();
	}
	

	@Test(priority=8)
	public void VerifyInsightLinkTest() {
		
		insightPage= homepage.ClickOnInsightLink();
	}
	
	@Test(priority=9)
	public void VerifyContactUsLinkTest() {
		
		contactusPage=homepage.ClickOnContactsUsLink();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	   
	}
	
	

