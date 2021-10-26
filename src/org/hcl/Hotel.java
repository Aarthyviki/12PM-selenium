package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
	     WebElement txtid=driver.findElement(By.xpath("//input[@name='username']"));
		txtid.sendKeys("Greens");
		
		WebElement txtpass=driver.findElement(By.xpath("//input[@type='password']"));
		txtpass.sendKeys("Greens123");
	}
}
