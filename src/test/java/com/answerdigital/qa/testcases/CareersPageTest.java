package com.answerdigital.qa.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.answerdigital.qa.base.TestBase;
import com.answerdigital.qa.pages.CareersPage;
import com.answerdigital.qa.pages.HomePage;
import com.answerdigital.qa.pages.JobApplyPage;


public class CareersPageTest extends TestBase{
	
	
		HomePage homepage;
		CareersPage careersPage;
		JobApplyPage jobapplyPage;
		String sheetname= "Careers-Search Jobs";
		
		public CareersPageTest() throws IOException {
			super();
		}
		
		
		
		@BeforeMethod
		public void setUp() throws Throwable {
			
			initialization();
			homepage=new HomePage();
			careersPage=new CareersPage();
			jobapplyPage=new JobApplyPage();
			careersPage= homepage.ClickOnCareersLink();
			
		  }
		
		
		
		@Test(priority=1)
		public void CareersPageTitleTest() {
			String title=careersPage.validateCareersPageTitle();
			Assert.assertEquals(title, "Careers | Answer Digital Careers");
		}
		
		
		/*
		 * //@DataProvider //public Object[][] getApplyJobData() throws Throwable {
		 * //Object data[][]= TestUtil.getTestData(sheetname); //return data; //}
		 */		
		
		@Test(priority=2 )
		public void SearchJobLinkTest() throws Throwable {
			
			careersPage.verifySearchJobfunctinality("Project Manager","leeds" , "25");
			jobapplyPage=careersPage.ClickOnApplyLink();
			jobapplyPage.verifyJobApplyPageDataEntry("Mr", "Tom", "Peter","peter123@xyz.com", "Town Hall street", "Halifax", "hx3 2ph", "9988123421");
			
			 
		}
		
		
		//@Test(priority=3)
		//public void ApplyLinkTest() throws Throwable {
			//jobapplyPage=careersPage.ClickOnApplyLink();
			//jobapplyPage.verifyJobApplyPageDataEntry("Mr", "Tom","Peter","peter@1234","Town Hall Street","Halifax","HX1 1TQ","1234567890");
			
		//}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		
		}

}
