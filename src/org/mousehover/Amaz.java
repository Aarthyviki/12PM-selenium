package org.mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amaz {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.manage().window().maximize();
	
	WebElement signin=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	
	Actions a=new Actions(driver);
	
	a.moveToElement(signin).perform();
	
   
}
}