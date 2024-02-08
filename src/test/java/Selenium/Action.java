package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {
public static void main(String[]args) throws Throwable {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
//	String st="https://www.flipkart.com/";
//	driver.get(st);
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	WebElement element = driver.findElement(By.xpath("//*[text()='Home & Furniture']"));
	Actions a = new Actions(driver);
	a.moveToElement(element).perform();
	
//	Actions a = new Actions(driver);
//	WebElement user = driver.findElement(By.xpath("//span[text()='Mobiles']"));
//	a.moveToElement(user).build().perform();
}
}
