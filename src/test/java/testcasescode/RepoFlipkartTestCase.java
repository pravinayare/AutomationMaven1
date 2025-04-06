package testcasescode;
 
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class RepoFlipkartTestCase {
	WebDriverData data;
//	WebDriver wd;
	RepoOfFlipkart f;
	public RepoFlipkartTestCase(WebDriverData data) {
//		this.data = data;
		f = new RepoOfFlipkart(data.wd);
	}
 
	@Given("User has launched Chrome browser")
	public void user_has_launched_chrome_browser() {
	    data.wd = new ChromeDriver();
	}
	@Given("User should be landed on Flipkart site.")
	public void user_has_landed_on_flipkart_website() {
	    f.site("https://www.flipkart.com/");
	}
	@When("user Enter {string} on search element.")
	public void user_has_entered_on_search_element(String product) {
	    f.Search(product);
 
	}
	@Then("Validated search element with title of the page")
	public void validated_search_element_with_title_of_the_page() {
 
	}
	@Then("validate search element by title of the page.")
	public void validated_search_element_with_of_the_page(String expTitle) {
	    f.VerifyTitle(expTitle);
	}
	@Then("Closed the browser")
	public void closed_the_browser() {
	    data.wd.quit();		
	}	
 
}