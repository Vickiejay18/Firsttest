package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptexe {
	public static void main(String[]args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement down = driver.findElement(By.xpath("//a[text()='Careers']"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','selenium')", user,pass,login); // for set attribute value
		
		Object os = js.executeScript("arguments[0].getAttribute('value')", user,pass,login);
		System.out.println(os);
		
		js.executeScript("arguments[0].click()", user,pass,login); //for click
		
		js.executeScript("arguments[0].scrollIntoView(true)", down); //for scrolldown
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)", down);
		
		js.executeScript("arguments[0].setAttribute('style','background:Yellow')", user); //for background color
		Thread.sleep(1000);
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red')", user); //for border color
		
		

}
}
