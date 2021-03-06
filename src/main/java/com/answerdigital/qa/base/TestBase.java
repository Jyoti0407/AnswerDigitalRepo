package com.answerdigital.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {  
		
		try {
			prop =new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\jyoti\\eclipse-workspaceNew\\AnswerDigitalTestProject\\src\\main\\java\\com\\answerdigital\\qa\\config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization() throws Throwable
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","C:\\work\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(4000);
		driver.get(prop.getProperty("url")); 
		Thread.sleep(4000);
	}
}
