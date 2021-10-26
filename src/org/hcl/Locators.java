package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {
	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		
	driver.manage().window().maximize();
	
	String title=driver.getTitle();
	System.out.println(title);
	
	WebElement txtUser=driver.findElement(By.xpath("//input[@id='email']"));
	txtUser.sendKeys("Greens");
	
	WebElement txtpass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	txtpass.sendKeys("Greens@123");
	   
	
	
	}

}
