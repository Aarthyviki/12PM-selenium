package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://en-gb.facebook.com/");
	    
	    driver.manage().window().maximize();
	    
	   String title= driver.getTitle();
		System.out.println(title);
		
		WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Aarthy");
		
		WebElement txtpass=driver.findElement(By.xpath("//input[@type='password']"));
		txtpass.sendKeys("aarthy123");
		
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
		
	}


}
