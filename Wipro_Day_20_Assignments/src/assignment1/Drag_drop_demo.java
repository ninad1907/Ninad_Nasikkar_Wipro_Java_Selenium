package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement destination=driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, destination).perform();
	}

}
