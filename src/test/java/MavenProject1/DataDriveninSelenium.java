package MavenProject1;
import java.io.FileInputStream;
import java.util.Set;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DataDriveninSelenium {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.get("https://www.myntra.com/");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\QUIKCARE COMPUTERS\\Desktop\\Book1.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = work.getSheetAt(0);
		for(int i = 1;i <= 4; i++) {
		XSSFRow row = sheet1.getRow(i);
		XSSFCell product = row.getCell(0);
		w.findElement(By.cssSelector
		("input[placeholder=\"Search for products, brands and more\"]"))
		.sendKeys(product.toString(),Keys.ENTER);
		Thread.sleep(2000);
		w.findElement(By.cssSelector("h4[class=\"product-product\"]")).click();
		String parent = w.getWindowHandle();
		Set<String> child = w.getWindowHandles();
		
		for (String c : child) {
			if (!c.equals(parent)) {
				w.switchTo().window(c);
				Thread.sleep(2000);
				w.findElement(By.cssSelector("pdp-add-to-bag.pdp-button.pdp-flex.pdp-center")).click();
				w.close();
				w.switchTo().window(parent);
			}
		}
		}	
		
w.quit();
		
		

	}

}
