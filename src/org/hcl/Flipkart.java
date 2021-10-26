package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	 
	driver.manage().window().maximize();
	
	String title=driver.getTitle();
	System.out.println(title);

	WebElement usertxt=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
    usertxt.sendKeys("Greens");
    
    WebElement passtxt=driver.findElement(By.xpath("//input[@type='password']"));
    passtxt.sendKeys("greens123");
    
    
    WebElement login=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
    login.click();
	
}
}