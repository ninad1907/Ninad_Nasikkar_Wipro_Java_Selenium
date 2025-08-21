package step_definition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_languageChange {
	WebDriver driver;
	@Given("Change language page should open in default browser")
	public void change_language_page_should_open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	}

	@When("hover to change language option")
	public void hover_to_change_language_option() throws InterruptedException {
		PageClassEbay pg=new PageClassEbay(driver);
		pg.language_in();
	}

	@And("click on country name")
	public void click_on_country_name() {
		PageClassEbay pg=new PageClassEbay(driver);
		pg.clickCountry();
	}

	@Then("change the language")
	public void change_the_language() {
		driver.close();
	}

}
