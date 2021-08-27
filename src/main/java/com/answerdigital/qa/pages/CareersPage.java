package com.answerdigital.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.answerdigital.qa.base.TestBase;


public class CareersPage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"JobSearchWidget\"]/div/div[2]/div/div/div[1]/div[1]/div/input")
	WebElement keywordtab;
	
	@FindBy(xpath="//*[@id=\"JobSearchWidget\"]/div/div[2]/div/div/div[1]/div[2]/div/input")
	WebElement locationtab;
	
	@FindBy(xpath="//*[@id=\"JobSearchWidget\"]/div/div[2]/div/div/div[1]/div[3]/div/select")
	WebElement milestab;
	
	
	@FindBy(xpath="//*[@id=\"JobSearchWidget\"]/div/div[2]/div/div/div[1]/div[4]/button")
	WebElement searchbtn;
	
	@FindBy(xpath="//*[@id=\"t3-mainnav\"]/div/div[3]/div/ul/li[3]/a")
	WebElement CareerTab;
	
	@FindBy(xpath="//*[@id=\"ResultsPane\"]/div/div[3]/div/div/div/div[2]/div[2]/div/a[2]")
	WebElement ApplyBtn;

	public CareersPage() {
		
		PageFactory.initElements(driver,this);		
	}
	
public String validateCareersPageTitle() {
	
	return driver.getTitle();
	
}

public void verifySearchJobfunctinality(String keyword, String location, String miles) throws InterruptedException {
	
	keywordtab.sendKeys(keyword);
	locationtab.sendKeys(location);
	Select select=new Select(milestab);
	select.selectByValue(miles);
	searchbtn.click();
	Thread.sleep(5000);

}
public JobApplyPage ClickOnApplyLink() {
	ApplyBtn.click();
	return new JobApplyPage();
}
}
