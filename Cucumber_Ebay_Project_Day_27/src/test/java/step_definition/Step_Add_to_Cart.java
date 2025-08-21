package step_definition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Add_to_Cart {
	WebDriver driver;
	@Given("Add to cart page should open in default browser")
	public void Add_to_cart_page_should_open_in_default_browser(){
		driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@When("login")
	public void login() {
		PageClassEbay pg=new PageClassEbay(driver);
		pg.email_in();
		pg.continue_in();
		pg.pass_in();
		pg.submit_in();
	}
	
	@And("add the product to cart and delete")
	public void add_the_product_to_cart_and_delete() throws InterruptedException {
		PageClassEbay pg=new PageClassEbay(driver);
		pg.addCart_in();
	}


	@Then("product deleted successfully")
	public void product_deleted_successfully() {
//		driver.close();
	}

}
