package step_definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClassEbay {
	WebDriver driver;
	By name=By.partialLinkText("Sign in");
	By email=By.id("userid");
	By password=By.id("pass");
	By cont=By.id("signin-continue-btn");
	By search=By.id("gh-ac");
	By submit=By.id("sgnBt");
	By product=By.partialLinkText("The Only Living Trusts Book You’ll Ever Need: How to Make Your Own Living Trust");
	By button=By.partialLinkText("Add to cart");
	By btn=By.cssSelector("div>button[aria-label=\"Close overlay\"]");
	By see_in_cart=By.id("atcBtn_btn_1");
	By delete=By.cssSelector("span>button[aria-label=\"Remove - The Only Living Trusts Book You’ll Ever Need: How to Make Your Own Living Trust\"]");
	By myName1=By.cssSelector("div>button[aria-controls=\"s0-1-4-9-3[0]-0-9-dialog\"]");
	By acc_settings=By.partialLinkText("Account settings");
	By personal_info=By.partialLinkText("Personal information");
	By edit=By.id("individual_personal_info_address_edit_button");
	By line1=By.id("addressLine1");
	By line2=By.id("streetAddressOptional");
	By line3=By.id("city");
	By line4=By.id("stateOrProvince");
	By line5=By.id("postalCode");
	By save=By.cssSelector("div>button[type=\"submit\"]");
	By shop=By.cssSelector("div>button[tabindex=\"3\"]");
	By category=By.linkText("Motorcycles");
	By language=By.xpath("//*[@id=\"glbfooter\"]/footer/div[1]/div[5]/div[3]/div/div/button");
	By country=By.partialLinkText("Japan");
	By category1=By.id("gh-cat");
	By product2=By.id("gh-search-btn");
	By myName=By.cssSelector("div>button[aria-controls=\"s0-1-4-9-3[0]-0-9-dialog\"]");
	By logout=By.partialLinkText("Sign out");
	By socialmedia=By.partialLinkText("Twitter");
	
	public PageClassEbay(WebDriver driver) {
		this.driver=driver;
	}
	//login
	public void email_in() {
		WebElement el=driver.findElement(name);
		el.click();
		WebElement el1=driver.findElement(email);
		el1.click();
		el1.clear();
		el1.sendKeys("ninadnasikkar1907@gmail.com");
	}
	
	public void continue_in() {
		driver.findElement(cont).click();
	}
	
	public void pass_in() {
		WebElement el2=driver.findElement(password);
		el2.click();
		el2.clear();
		el2.sendKeys("Maldives#6872");
	}
	
	public void submit_in() {
		driver.findElement(submit).click();
	}
//search for products
	public void search_in(String products) {
			  WebElement el3=driver.findElement(search);
			  el3.clear();
			  el3.sendKeys(products);
			  el3.sendKeys(Keys.ENTER);
	}
	//add to cart and delete from cart
	public void addCart_in() throws InterruptedException {
		
		Thread.sleep(3000);
		WebElement el4=driver.findElement(search);
		el4.clear();
		el4.sendKeys("The Only Living Trusts Book You’ll Ever Need: How to Make Your Own Living Trust");
		el4.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(product).click();
		
		String currentWindow = driver.getWindowHandle();
	    for (String handle : driver.getWindowHandles()) {
	        if (!handle.equals(currentWindow)) {
	            driver.switchTo().window(handle);
	            break;
	        }
	    }
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement el5 = wait.until(ExpectedConditions.elementToBeClickable(button));
	    el5.click();
	    
	    Thread.sleep(4000);
		  WebElement el6=driver.findElement(btn);
		  el6.click();
		  
		  WebElement el7=driver.findElement(see_in_cart);
		  el7.click();
		  
		  WebElement el8=driver.findElement(delete);
		  el8.click();
	    
	}
	
	
	//change address
	public void changeAddress_in() throws InterruptedException {
		  Actions act=new Actions(driver);
		  WebElement el10=driver.findElement(myName1);
		  act.moveToElement(el10).perform();
		  
		  driver.findElement(acc_settings).click();
		  driver.findElement(personal_info).click();
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,600)");
		
		driver.findElement(edit).click();
		js.executeScript("window.scrollBy(0,300)");
		
		
		WebElement add1=driver.findElement(line1);
		  add1.clear();
		  add1.sendKeys("Lunkad Avnenue");
		  add1.sendKeys(Keys.ENTER);
		  
		WebElement add2=driver.findElement(line2);
		  add2.clear();
		  add2.sendKeys("Viman Nagar");
		  add2.sendKeys(Keys.ENTER);
		  
		WebElement add3=driver.findElement(line3);
		add3.clear();
		add3.sendKeys("Pune");
		add3.sendKeys(Keys.ENTER);

		WebElement add4=driver.findElement(line4);
		Select sel=new Select(add4);
		sel.selectByValue("MH");
			  
		WebElement add5=driver.findElement(line5);
		add5.clear();
		add5.sendKeys("411036");
		add5.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElement(save).click();
				  
	}
	//shop by category
	public void shopByCategory_in() {
		driver.findElement(shop).click();
	}
	
	public void category() {
		driver.findElement(category).click();

	}
	
	//shop by all categories
	public void shopAll_in() {
		WebElement cat1=driver.findElement(category1);
		cat1.click();
		Select sel=new Select(cat1);
		sel.selectByValue("20081");
		driver.findElement(product2).click();
		
	}
	//change language
	public void language_in() throws InterruptedException {

		  Actions act=new Actions(driver);
		  WebElement el7=driver.findElement(language);
		  act.moveToElement(el7).perform();
		  Thread.sleep(3000);
	}
	
	public void clickCountry() {
		driver.findElement(country).click();
	}
	
	//sign out
	public void hoverName() {
	  Actions act=new Actions(driver);
	  WebElement el8=driver.findElement(myName);
	  act.moveToElement(el8).perform();
	}
	
	public void clickSignOut() {
	  driver.findElement(By.partialLinkText("Sign out")).click();
	}
	
	//access social media handle
	public void clickMedia() {
		driver.findElement(socialmedia).click();
	}
}
