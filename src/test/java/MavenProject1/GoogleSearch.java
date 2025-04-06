package MavenProject1;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main1(String[] args) throws Exception {
		// TODO Auto-generated method stub


			WebDriver w = new ChromeDriver();
			w.get("https://www.google.com/");
			FileInputStream fis = new FileInputStream ("C:\\Users\\QUIKCARE COMPUTERS\\Downloads\\Automation.xlsx");
			XSSFWorkbook work = new XSSFWorkbook();
			XSSFSheet Sheet1 = work.getSheet("Sheet1");
			for(int i = 1;i <= 6;i++) {
				
				XSSFRow row = Sheet1.getRow(i);
				XSSFCell data = row.getCell(0);
				w.findElement(By.id("A8SBwf")).sendKeys(data.toString(),Keys.ENTER);
				Thread.sleep(3000);
				w.findElement(By.id("A8SBwf")).clear();
				
			}
	 		
			w.quit();
			
			
		}

	}
