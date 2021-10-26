package org.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		
		
		driver.switchTo().frame("login_page");
		
		WebElement txtuser=driver.findElement(By.xpath("//input[@type='text']"));
		txtuser.sendKeys("greens");
		

		WebElement cont=driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		cont.click();
		
		
}
}