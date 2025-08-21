package step_definition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Search {
	WebDriver driver;
	@Given("Search page should open in default browser")
	public void search_page_should_open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@When("^search for multiple (.*)$")
	public void search_for_multiple_products(String products) {
	   PageClassEbay pg=new PageClassEbay(driver);
	   pg.search_in(products);
	}


	@Then("open the searched product")
	public void open_the_searched_product() {
		driver.close();
	}

}
