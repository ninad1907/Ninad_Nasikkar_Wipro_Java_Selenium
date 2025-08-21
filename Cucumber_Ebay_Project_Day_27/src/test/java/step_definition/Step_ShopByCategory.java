package step_definition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_ShopByCategory {
	WebDriver driver;
	@Given("Shop by category page should open in default browser")
	public void shop_by_category_page_should_open_in_default_browser() {
	    driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@When("click on shop by category option")
	public void click_on_shop_by_category_option() {
		PageClassEbay pg=new PageClassEbay(driver);
		pg.shopByCategory_in();
	}

	@And("click on category")
	public void click_on_category() {
		PageClassEbay pg=new PageClassEbay(driver);
		pg.category();
	}

	@Then("view products by category")
	public void view_products_by_category() {
	   driver.close();
	}
}
