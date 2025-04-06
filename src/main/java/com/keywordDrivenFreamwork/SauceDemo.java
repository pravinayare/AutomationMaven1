package com.keywordDrivenFreamwork;

import java.io.FileInputStream;
import java.util.logging.FileHandler;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class SauceDemo {

	public static <TakeScreenshot> void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver w= new ChromeDriver();
		w.get("https://www.saucedemo.com/");
		RepoOfSaucedemo r = new RepoOfSaucedemo(w);
		FileInputStream fis = new FileInputStream("\"C:\\Users\\QUIKCARE COMPUTERS\\Downloads\\SauceDemo.xlsx\"");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = new work.getSheet("\"C:\\Users\\QUIKCARE COMPUTERS\\Downloads\\New Microsoft Excel Worksheet.xlsx\");		
		for(int i = 1; i <=10; i++) {
			
			XSSFRow row = sheet.getRow(i);
			XSSFCell testStep = row.getCell(0);
			switch(testStep.toString()) {
				case "Enter username and password":
				r.username("standerd_user");
				Thread.sleep(2000);
				r.password ("Secret_sauce");
				Thread.sleep(2000);
				break;
				case "click on login button" :
					r.login();
					Thread.sleep(2000);
					break;
				case "click on add to cart button" :
					r.addToCart();
					break;
					
				case "Go to cart" :
					Thread.sleep(2000);
					r.addToCart();
					break;
					
				case "click on checkout button":
					Thread.sleep(2000);
					r.checkout():
						break;
				case "Enter firstname, lastname  and pin code" :
					Thread.sleep(2000);
					r.firstname("raj");
					Thread.sleep(2000);
					r.lastname("kumar");
					Thread.sleep(2000);
					r.postalcode("500000");
					break;
				case "Click on Finish button" :
					Thread.sleep(2000);
					r.finish();
					TakeScreenshot tss = (TakeScreenshot) w;
					FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new file (""))
					break;
				case "click on menu option" :
					Thread.sleep(2000);
					r.menu();
					break;
				case "click on logout" :
					Thread.sleep(2000);
					r.logout();
					break;
					
					default:
						System.out.println("Invalid Test steps or invalid Keyword");
						break
					
			}
		}
	}

}
