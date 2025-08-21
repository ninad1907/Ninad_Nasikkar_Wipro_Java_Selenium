package step_definition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Address {
	WebDriver driver;
	@Given("Address page should open in default browser")
	public void address_page_should_open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@When("login to Ebay")
	public void login_to_ebay() {
		PageClassEbay pg=new PageClassEbay(driver);
		pg.email_in();
		pg.continue_in();
		pg.pass_in();
		pg.submit_in();
	}

	@Then("Update current address")
	public void update_current_address() throws InterruptedException {
		PageClassEbay pg=new PageClassEbay(driver);
		pg.changeAddress_in();
		driver.quit();
	}
}
