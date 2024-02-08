package Selenium;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robott {
	public static void main(String[]args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
//		String st="https://www.f.com/";
//		driver.get(st);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		WebElement E = driver.findElement(By.id("email"));
		ac.sendKeys(E,"jai").build().perform();
		ac.doubleClick(E).build().perform();
		ac.contextClick(E).build().perform();
	
	Robott r=new Robott();
	for (int i=0;i<3;i++) {
		r.KeyPress (KeyEvent.VK_DOWN);
		r.KeyRelease (KeyEvent.VK_DOWN);
		}
		r.KeyPress(KeyEvent.VK_ENTER);
		r.KeyRelease(KeyEvent.VK_ENTER);
		
		r.KeyPress(KeyEvent.VK_TAB);
		r.KeyRelease(KeyEvent.VK_TAB);
	
	r.KeyPress(KeyEvent.VK_CONTROL);
	r.KeyPress(KeyEvent.VK_V);
	r.KeyRelease(KeyEvent.VK_CONTROL);
		r.KeyRelease(KeyEvent.VK_V);
		
			
	}

	private void KeyRelease(int vkDown) {
		// TODO Auto-generated method stub
		
	}

	private void KeyPress(int vkDown) {
		// TODO Auto-generated method stub
		
	}
//
//	public void keyPress(int vkDown) {
//		// TODO Auto-generated method stub
//
}
