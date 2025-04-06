package MavenProject1;

import java.io.File;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class flipkartSearchtest {


		// TODO Auto-generated method stub
		
	
			Logger log;
			WebDriver wd;
			
			
			@BeforeClass
			public void launchBrowser() {
			log = LogManager.getLogger();
			wd = new ChromeDriver();
			log.info("User is Opning Chrome browser");
			wd.get("https://www.flipkart.com/");
			log.info("user id being redirected to flipkart website");
			
			}
			
			String change;
			
			@Test(dataProviderClass = Data.class,dataProvider = "demo")
			public void Search(String search) throws Exception {
			Thread.sleep(2000);
			wd.findElement(By.name("q")).sendKeys(search,Keys.ENTER);
			change = search;
			Thread.sleep(2000);
		
			}
			
			@AfterMethod
			public void screenShot() throws Exception {
			TakesScreenshot tss = (TakesScreenshot) wd;
			FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("D:\\Automation_screenshot\\"+change+".jpg"));
			Thread.sleep(2000);
			wd.findElement(By.name("q")).sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
			log.info("After product got searched uuser has clearsearch box");
//		
			}
			
			@AfterClass
			public void close() throws Exception {
			Thread.sleep(2000);
			wd.close();
			log.info("After searching the each product user has closed chrome browser");
			}

	}


