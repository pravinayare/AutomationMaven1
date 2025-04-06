package testcasescode;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

WebDriverData data;

public Hooks(WebDriverData d) {
	data = d;
}
	 @Before
	 public void launchBrowser() {
		 data.wd = new ChromeDriver();
	 }
	 
	 @After
	 public void CloseBrowser() {
		 data.wd.quit();
	 }

	}

