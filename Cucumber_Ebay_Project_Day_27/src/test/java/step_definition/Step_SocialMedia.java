package step_definition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_SocialMedia {
	WebDriver driver;
	@Given("Social media page should open in default browser")
	public void social_media_page_should_open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@When("click on twitter")
	public void click_on_twitter() {
		PageClassEbay pg=new PageClassEbay(driver);
		pg.clickMedia();
	}

	@Then("Ebay account on twitter opened successfully")
	public void ebay_account_on_twitter_opened_successfully() {
		driver.close();
	}



}
