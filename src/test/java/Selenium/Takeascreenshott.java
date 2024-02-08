package Selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takeascreenshott {
	public static void main(String[]args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
//		String st="https://www.f.com/";
//		driver.get(st);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\jaias\\eclipse-workspace\\jaymaven\\target\\jai.image.png");
		FileUtils.copyFile(src,desc);
	}
}
