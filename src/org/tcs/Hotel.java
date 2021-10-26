package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {

public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		WebElement txtuser=driver.findElement(By.xpath("//input[@name='username']"));
		txtuser.sendKeys("Greens");
		
		WebElement txtpass=driver.findElement(By.xpath("//input[@type='password']"));
		txtpass.sendKeys("Greens123");
		
		String attb=txtuser.getAttribute("value");
		System.out.println(attb);
		
		
	String attbpass=txtpass.getAttribute("value");
	System.out.println(attbpass);
	
}
}