package MavenProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver w = new EdgeDriver();
		w.manage().window().maximize();
		w.get("https://www.flipkart.com/");
		RepoOfFlipkart f = new RepoOfFlipkart(w);
		f.Search("iphone");
		Thread.sleep(2000);
		f.product();
		TimeUnit.SECONDS.sleep(2);
		f.windowHandle();
		f.AddTocart();
		TimeUnit.SECONDS.sleep(2);
		f.close();
		f.switchparent();
		f.clearProduct();
		f.Search("Go Pro");
		w.navigate().refresh();
		f.product();
		f.windowHandle();
		f.AddTocart();
		f.close();
		f.switchparent();
		f.clearProduct();
		f.Search("Mouse");
		w.navigate().refresh();
		f.product();
		f.windowHandle();
		f.AddTocart();
		f.close();
	}

}
