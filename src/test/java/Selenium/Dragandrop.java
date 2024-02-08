package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Dragandrop {
public static void main(String[]args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
	WebElement drag=driver.findElement(By.xpath("//a[contains(text(), 'BANK ')]"));
	WebElement drop=driver.findElement(By.xpath("//li[@class='placeholder']"));
	WebElement drags=driver.findElement(By.xpath("//a[contains(text(), ' 5000 ')]"));
	WebElement drops=driver.findElement(By.xpath("//li[@class='placeholder'])[2]"));
	
	Actions a=new Actions(driver);
	a.dragAndDrop(drag, drop).perform();
	a.dragAndDrop(drags,drops).perform();
	

	
	
	
}
}




