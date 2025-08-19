/*Create testing class 
Project URL= https://www.ebay.com/
1.	Add pre-requisite
2.	Create 10 testcases for
1.Login
2.Multiple searches using array list or array
3.Add to cart
4.delete from cart
5.Change login name
6. change current address
7.shop by categories
8.select particular product right click on that product image and find out description of that product.
9.shop by all categories and check whether this function is working fine or not
10. change the language of your application using setting

3.	Create Post condition for every testcase
*/


package ebay_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Ebay_project{
	WebDriver driver;
	@BeforeTest//1(primary condition)
	  public void beforeTest() throws InterruptedException {
		  driver=new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Thread.sleep(5000);
		  
	  }
	
  @Test//(Actual test cases)
  //test case 1
  public void login() throws InterruptedException {
	  
	  WebElement btn1=driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
	  btn1.click();
	   
	  WebElement email=driver.findElement(By.id("userid"));
	  email.sendKeys("ninadnasikkar1907@gmail.com");
	  
	  WebElement btn=driver.findElement(By.id("signin-continue-btn"));
	  btn.click();

	  WebElement password=driver.findElement(By.id("pass"));
	  password.sendKeys("Maldives#6872");
	  
	  WebElement signin=driver.findElement(By.id("sgnBt"));
	  signin.click();
  }
  
  @Test
  //test case 2
  public void search() throws InterruptedException{
	  String[] list= {"Watch","Electronics","Sports"};
	  for(String sr:list) {
		  WebElement search=driver.findElement(By.id("gh-ac"));
		  search.clear();
		  search.sendKeys(sr);
		  search.sendKeys(Keys.ENTER);
		  Thread.sleep(2000);

	  }
  }
  
  @Test
  //test case 3
  public void addToCart() throws InterruptedException {

	  login();
	  Thread.sleep(4000);
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  search.sendKeys("The Only Living Trusts Book You’ll Ever Need: How to Make Your Own Living Trust");
	  search.sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  WebElement product=driver.findElement(By.partialLinkText("The Only Living Trusts Book You’ll Ever Need: How to Make Your Own Living Trust"));
	  product.click();

	  
	  String currentWindow = driver.getWindowHandle();
	    for (String handle : driver.getWindowHandles()) {
	        if (!handle.equals(currentWindow)) {
	            driver.switchTo().window(handle);
	            break;
	        }
	    }
		
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Add to cart")));

	  button.click();
	  
	  Thread.sleep(3000);
	  
	  //Test case 4
	 
	 
	  WebElement btn=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[6]/ul/li[2]/div[1]/div/div[2]/div[2]/button"));
	  btn.click();
	  
	  WebElement see_in_cart=driver.findElement(By.id("atcBtn_btn_1"));
	  see_in_cart.click();
	  
	  WebElement delete=driver.findElement(By.cssSelector("span>button[aria-label=\"Remove - The Only Living Trusts Book You’ll Ever Need: How to Make Your Own Living Trust\"]"));
	  delete.click();

  }
  
  @Test
  //test case 5

  public void changeLoginName() throws InterruptedException {
	  
	  login();
	  Thread.sleep(4000);
	  driver.navigate().to("https://accountsettings.ebay.com/uas");
	  Thread.sleep(2000);
	  
	  WebElement personal_info=driver.findElement(By.cssSelector("a[id=\"account-settings-link-PI\"]"));
	  personal_info.click();
	  
	  Thread.sleep(15000);
	  
	  WebElement id=driver.findElement(By.id("individual_username_edit_button"));
	  id.click();
	  
	  WebElement username=driver.findElement(By.id("user_name"));
	  username.click();
	  
	  username.clear();
	  username.sendKeys("ninad1590");
	  username.sendKeys(Keys.ENTER);
	  
	  WebElement save=driver.findElement(By.id("username_submit_edit_btn"));
	  save.click(); 
	  
  }
  
  @Test
  //test case 6
  public void changeAddress() throws InterruptedException {
	  login();
	  Actions act=new Actions(driver);
	  WebElement name=driver.findElement(By.cssSelector("div>button[aria-controls=\"s0-1-4-9-3[0]-0-9-dialog\"]"));
	  act.moveToElement(name).perform();
	  
	  driver.findElement(By.partialLinkText("Account settings")).click();
	  
	  WebElement personal_info=driver.findElement(By.cssSelector("a[id=\"account-settings-link-PI\"]"));
	  personal_info.click();
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,600)");

	  WebElement edit=driver.findElement(By.id("individual_personal_info_address_edit_button"));
	  edit.click();
	  
	  js.executeScript("window.scrollBy(0,300)");
	  
	  WebElement line1=driver.findElement(By.id("addressLine1"));
	  line1.clear();
	  line1.sendKeys("East Street");
	  line1.sendKeys(Keys.ENTER);

	  WebElement line2=driver.findElement(By.xpath("//*[@id=\"streetAddressOptional\"]"));
	  line2.clear();
	  line2.sendKeys("Kothrud");
	  line2.sendKeys(Keys.ENTER);

	  
	  WebElement line3=driver.findElement(By.id("city"));
	  line3.clear();
	  line3.sendKeys("Mumbai");
	  line3.sendKeys(Keys.ENTER);

	  WebElement line4=driver.findElement(By.id("stateOrProvince"));

	  Select sel=new Select(line4);
	  sel.selectByValue("MH");

	
	  
	  WebElement line5=driver.findElement(By.id("postalCode"));
	  line5.clear();
	  line5.sendKeys("411004");
	  line5.sendKeys(Keys.ENTER);

	  
	  WebElement save=driver.findElement(By.id("address_edit_submit_button"));
	  save.click();
	  
  }
  
  @Test
  //test case 7
  public void shopByCategories() throws InterruptedException {
	  login();
	  
	  Thread.sleep(4000);
	  WebElement shop=driver.findElement(By.cssSelector("div>button[tabindex=\"3\"]"));
	  shop.click();
	  
	  WebElement category=driver.findElement(By.linkText("Motorcycles"));
	  category.click();
	  
	  Thread.sleep(2000);
	  
	  WebElement product=driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[3]/section[2]/ul/li[2]/div/div/div[1]/a/img"));
	  product.click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("binBtn_btn_1")).click();
  }
  
  @Test
  //test case 8
  public void description() throws InterruptedException {
	  login();
	  Thread.sleep(4000);
	  
	  WebElement shop=driver.findElement(By.cssSelector("div>button[tabindex=\"3\"]"));
	  shop.click();
	  
	  WebElement category=driver.findElement(By.linkText("Motorcycles"));
	  category.click();
	  
	  Thread.sleep(2000);
	  
	  WebElement product=driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[3]/section[2]/ul/li[2]/div/div/div[1]/a/img"));
	  product.click();
	  
	  Thread.sleep(2000);
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,900)");
	  js.executeScript("window.scrollBy(0,500)");

	  
  }
  
  @Test
  //test case 9
  public void shopByAllCategories() throws InterruptedException {
	  login();
	  Thread.sleep(4000);  
	  
	  WebElement category=driver.findElement(By.id("gh-cat"));
	  category.click();
	  
	  Select sel=new Select(category);
	  sel.selectByValue("20081");
	  
	  driver.findElement(By.id("gh-search-btn")).click();
	  Thread.sleep(2000);
	  WebElement product=driver.findElement(By.cssSelector("div>img[alt=\"Antique Furniture\"]"));
	  product.click();
	  Thread.sleep(2000);
	  
	  WebElement var=driver.findElement(By.cssSelector("a>img[alt=\"Danish Modern and Beyond : Scandinavian Inspired Furniture from Heywood-Wakefield by Donna S. Baker\"]"));
	  var.click();
	  
	  Thread.sleep(2000);
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,900)");
	  
	  driver.findElement(By.id("binBtn_btn_1")).click();
}
  
  @Test
  //test case 10
  public void changeLanguage() throws InterruptedException {
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,300)");
	  js.executeScript("window.scrollBy(0,600)");
	  js.executeScript("window.scrollBy(0,900)");
	  js.executeScript("window.scrollBy(0,600)");
	  Actions act=new Actions(driver);
	  WebElement language=driver.findElement(By.cssSelector("div>button[aria-label=\"eBay Sites - United States - change site\"]"));
	  act.moveToElement(language).perform();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.partialLinkText("Japan")).click();
  }
  
  @Test
  //test case 11
  public void signOut() throws InterruptedException {
	  login();
	  Actions act=new Actions(driver);
	  WebElement name=driver.findElement(By.cssSelector("div>button[aria-controls=\"s0-1-4-9-3[0]-0-9-dialog\"]"));
	  act.moveToElement(name).perform();
	  
	  driver.findElement(By.partialLinkText("Sign out")).click();
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}

