package MavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver w = new ChromeDriver();
		w.get("http://Cloudconvert.com/");
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"app\"]/div/div/[2]/div/div/[2]/div/div/input")).sendKeys("C:\\Users\\Lab-03-Demo\\Music\\Download.png");
		

	}

}
