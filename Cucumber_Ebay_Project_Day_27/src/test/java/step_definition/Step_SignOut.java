package step_definition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_SignOut {
	WebDriver driver;
	@Given("Sign Out page should open in default browser")
	public void sign_out_page_should_open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("login to web app")
	public void login_to_web_app() {
		PageClassEbay pg=new PageClassEbay(driver);
		pg.email_in();
		pg.continue_in();
		pg.pass_in();
		pg.submit_in();
	}

	@And("hover to My name option")
	public void hover_to_my_name_option() {
		PageClassEbay pg=new PageClassEbay(driver);
		pg.hoverName();
	}

	@And("click on sign out")
	public void click_on_sign_out() {
		PageClassEbay pg=new PageClassEbay(driver);
		pg.clickSignOut();
	}

	@Then("Sign out of web application")
	public void sign_out_of_web_application() {
		driver.close();
	}
}
