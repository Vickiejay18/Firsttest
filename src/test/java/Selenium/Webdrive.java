package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdrive {
	public static void main(String[] args) throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
