package MavenProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontAccounting {

public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver w = new ChromeDriver();
		System.out.println("Executor "+w);		
		w.manage().window().maximize();
		w.get("https://demo.frontaccounting.eu/");
		RepoOfFrontAccounting f = new RepoOfFrontAccounting(w);
        f.ClearUserName();
        f.EnterUsername("demouser");
        f.clarpassword();
        f.Enterpassword("password");
        f.login();
        f.clickonSQE();
        f.Customer("WWW");
        f.payment("Payment due within 10 days");
        w.navigate().refresh();
        Thread.sleep(2000);
        f.Item("Milk");
        f.clickonAddItem();
        f.placeOrder();
        Thread.sleep(2000);
        f.VTQ();
        Thread.sleep(2000);
        f.Windowhandle();
        f.switchParent();
        f.logout();
        f.Close();

	}
}
