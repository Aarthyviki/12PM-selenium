package org.handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get(" https://www.homedepot.com/");
	
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.manage().window().maximize();
	
	WebElement fan=driver.findElement(By.xpath("//input[@id='headerSearch']"));
	fan.sendKeys("ceiling fan");
	
	WebElement search=driver.findElement(By.xpath("//button[@id='headerSearchButton']"));
	search.click();
	
	String parentId=driver.getWindowHandle();
	
	Set<String> allwindows=driver.getWindowHandles();
	
	for(String Eachid:allwindows) {
		if(!parentId.equals(Eachid)) {
			driver.switchTo().window(Eachid);
		}
	}

	WebElement fan1=driver.findElement(By.xpath("(//div[@class='visualNav'])[1]"));
	fan1.click();
	
	String parentid=driver.getWindowHandle();
	
	Set<String>allwindows1=driver.getWindowHandles();
	
	for(String EachId:allwindows1) {
		if(!parentid.equals(EachId)) {
			driver.switchTo().window(EachId);
		}
	}
	
	WebElement remote=driver.findElement(By.xpath("(//span[@class='product-pod__title__product'])[1]"));
	remote.click();
	
	
}
}