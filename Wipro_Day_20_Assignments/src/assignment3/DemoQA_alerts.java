package assignment3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA_alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//sample alert(accept)
		//confirm alert(accept or cancel)
		//prompt alert(enter text)--> accept or cancel
		
		WebElement samplealert=driver.findElement(By.id("alertButton"));
		samplealert.click();
		Thread.sleep(4000);
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		
		Thread.sleep(2000);
		WebElement timealert=driver.findElement(By.id("timerAlertButton"));
		timealert.click();
		Thread.sleep(7000);
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		
		Thread.sleep(3000);
		WebElement confirmalert=driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Thread.sleep(4000);
		Alert alert3=driver.switchTo().alert();
		alert3.dismiss();
		
		Thread.sleep(3000);
		WebElement promptalert=driver.findElement(By.id("promtButton"));
		promptalert.click();
		Thread.sleep(4000);
		Alert alert4=driver.switchTo().alert();
		alert4.sendKeys("Vijay Joshi");
		alert4.accept();
		
		driver.quit();
	}

}
