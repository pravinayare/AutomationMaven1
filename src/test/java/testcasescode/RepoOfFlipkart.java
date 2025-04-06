package testcasescode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RepoOfFlipkart {

	WebDriver w;
	
		public RepoOfFlipkart(WebDriver wd) {	
			w = wd;		
		}
		
		By search = By.name("q");
		public void site(String url) {
			w.get(url);
		}
		
		public void Search (String product) {
		w.findElement(search).sendKeys(product,Keys.ENTER);
		}
		 public void VerifyTitle(String ExpectedTitle) {
			 String acttitle = w.getTitle();
			 boolean ans = acttitle.contains(ExpectedTitle);
			 Assert.assertEquals(ans, true);
	}
		 public void BrowserClose() {
			 w.quit();
		 }

}
