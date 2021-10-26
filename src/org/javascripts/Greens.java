package org.javascripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		driver.manage().window().maximize();
		
		WebElement address=driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",address);
		
		
	}
	
}
