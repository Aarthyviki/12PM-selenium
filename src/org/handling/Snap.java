package org.handling;

import java.awt.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snap {
	public static void main(String[] args) {
		
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.snapdeal.com/ ");
	
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.manage().window().maximize();
	WebElement sani=driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
	sani.sendKeys("hand sanitizer");
	
	WebElement search=driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	search.click();
	
String parentid=driver.getWindowHandle();
	
	Set<String> allwindows=driver.getWindowHandles();
	
	for(String eachid:allwindows) {
		if(!parentid.equals(eachid)) {
			driver.switchTo().window(eachid);
		}
	}

	
	
	
	driver.switchTo().frame("iframeContainer");
	
	
		WebElement first=driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
	first.click();
	
	
}
}