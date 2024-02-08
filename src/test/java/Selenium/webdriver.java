package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriver {
public static void main(String[]args)throws InterruptedException{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	driver.manage().window().maximize();
	WebElement element=driver.findElement(By.name("alert"));
	element.click();
	Thread.sleep(2000);
	Alert simple=driver.switchTo().alert();
	simple.accept();
	
	WebElement element1=driver.findElement(By.name("confirmation"));
	element1.click();
	Thread.sleep(2000);
	Alert confirmation=driver.switchTo().alert();
	confirmation.dismiss();
	
	WebElement element2=driver.findElement(By.name("prompt"));
	element2.click();
	Thread.sleep(2000);
	Alert prompt=driver.switchTo().alert();
	prompt.sendKeys("Jayakumar");
	prompt.accept();
}
}
