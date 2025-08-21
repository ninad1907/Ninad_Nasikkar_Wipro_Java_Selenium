package step_definition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Login {
	WebDriver driver;
	@Given("login page should open in default browser")
	public void login_page_should_open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@When("click on username button and enter valid username")
	public void click_on_username_button_and_enter_valid_username() {
		PageClassEbay pg=new PageClassEbay(driver);
		pg.email_in();
	}

	@And("click on continue button")
	public void click_on_continue_button() {
		PageClassEbay pg=new PageClassEbay(driver);
		pg.continue_in();
	}
	
	@And("add password")
	public void add_password() {
		PageClassEbay pg=new PageClassEbay(driver);
		pg.pass_in();
	}
	
	@And("click on submit button")
	public void click_on_submit_button() {
		PageClassEbay pg=new PageClassEbay(driver);
		pg.submit_in();
	}

	@Then("open home page")
	public void open_home_page() {
		driver.close();
	}
}
