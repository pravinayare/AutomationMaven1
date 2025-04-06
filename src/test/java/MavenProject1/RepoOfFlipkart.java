package MavenProject1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RepoOfFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
		private WebDriver b;
		private String mainWindow;
		public RepoOfFlipkart(WebDriver a) {
			
		b = a;
		
		}
		
		private By search = By.name("q");
		private By product = By.className("CGtC98");
		private By buyNow = By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2\"]");
		private By cart = By.className("_9Wy27C");
		private By AddtocartOption = By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2 JTo6b7\"]");
		private By product2 = By.className("wjcEIp");
		
		
		public void Search(String product) {
		b.findElement(search).sendKeys(product);
		b.findElement(search).submit();
			
		}
		
		public void product() {
		try {
			b.findElement(product).click();
		} catch (Exception e) {
			// TODO: handle exception
		b.findElement(product2).click();
		}
			
		}
		
		public void windowHandle() {
			
			String parent = b.getWindowHandle();
			mainWindow = parent;
			System.out.println(parent);
			Set<String> child = b.getWindowHandles();
			for(String c : child) {
				if(!c.equals(parent)) {
					b.switchTo().window(c);
					System.out.println(c);	
				
				}
				
			}
			
				
		}
			
				
				public void AddTocart() {
					
					b.navigate().refresh();
					try {
						b.findElement(AddtocartOption).click();
					} catch (Exception e) {
						
						b.findElement(buyNow).click();
						b.findElement(cart).click();	
					}
					
				}
			
				public void close() {
					b.close();
				}
				public void switchparent() {
					b.switchTo().window(mainWindow);
				}
				
			public void clearProduct() {
				
				b.findElement(search).sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
			}
			
		}
			
