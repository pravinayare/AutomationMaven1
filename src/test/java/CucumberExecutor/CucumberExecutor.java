package CucumberExecutor;
	 
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
	 
	@CucumberOptions(
	features = "src/test/java/testcase",
	glue = "testcasescode",
	plugin = "html:CucumberReport/cucumberReport.html",
	dryRun = true,
	tags = "@multiSearch2"
	)
	 
	public class CucumberExecutor extends AbstractTestNGCucumberTests {
	 
	}
	 
