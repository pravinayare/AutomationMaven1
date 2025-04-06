package MavenProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
	 WebDriver wd=new ChromeDriver();
	 wd.get("https://mvnrepository.com/");
	 wd.manage().window().maximize();
	 wd.close();
	 
	 
	}

}
