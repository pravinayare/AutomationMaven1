package MavenProject1;

import java.util.Collection;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RepoOfFrontAccounting {
	WebDriver w;
	String parentwindow;

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public RepoOfFrontAccounting(WebDriver w2) {
		// TODO Auto-generated constructor stub
	}
		public void RepoOfFronAccounting(WebDriver wd) {
			PageFactory.initElements(wd, this);
			w = wd;		
		}
		
		@FindBy(name = "user_name_entry_field") WebElement username;
		@FindBy(css = "input[name=\"Password\"]") WebElement password;
		@FindBy(name = "Submituser") WebElement Loginbtn;
		@FindBy(linkText = "Sales Quotation Entry") WebElement SQE;
		@FindBy(id = "Customer_id") WebElement Customer;
		@FindBy(id = "Payment") WebElement Payment;
		@FindBy(id = "Stock_id") WebElement Item;
		@FindBy(id = "AddItem") WebElement AddItem;
		@FindBy(id = "ProcessOrder") WebElement PlaceOder;
		@FindBy(linkText = "View This Quotation") WebElement VTQ;
		@FindBy(linkText = "Close") WebElement VTQClose;
		@FindBy(linkText = "Logout") WebElement Logoutbtn;
		
		public void ClearUserName() {
			username.clear();	
		}
		public void EnterUsername(String username, WebElement Username) {
			Username.sendKeys(username);
		}
	    public void clearpassword() {
	    	password.clear();
	    }
		public void Enterpassword(String password) {
			password.sendkyes (password);
		}
	    public void login () {
	    	Loginbtn.click();
	    }
	
	    public void clickonSQE() {
	    	SQE.click();
	    }
	    public void Customer(String CustomerVisibilityText) {
	    	Select s = new Select(Customer);
	    	s.selectByVisibleText(CustomerVisibilityText);
	    }
	    public void payment(String PaymentVisibleText) {
	    	Select s = new Select(Payment);
	    s.selectByVisibleText(PaymentVisibleText);
	    }
	    public void Item(String ItemVisibleText) {
	    	Select s = new Select(Item);
	    s.selectByVisibleText(ItemVisibleText);
	    }
	    public void clickonAddItem() {
	    	AddItem.click();
	    }
	    public void placeOrder() {
	    	PlaceOder.click();
	    }
	    public void VTQ() {
	    	VTQ.click();
	    }
	    public void Windowhandle() {
	    	String parent = w.getWindowHandle();
	    	parentwindow = parent;
	    	Set<String> childparent = w.getWindowHandles();
	    	for (String cp : childparent) {
	    		if (!cp.equals(parent)) {
	    			w.switchTo().window(cp);
	    			Close();
	    		}
	    	}
	    }
	public void Close() {
		w.close();
	}
	public void switchParent() {
		w.switchTo().window(parentwindow);
	}
	public void logout() {
		Logoutbtn.click();
		
	}
}
	
