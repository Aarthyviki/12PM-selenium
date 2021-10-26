package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	
public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		WebElement enter=driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		enter.sendKeys("iphone");
		
		WebElement search=driver.findElement(By.xpath("(//span[@class='search-text'])[1]"));
		search.click();
		
		
}
}