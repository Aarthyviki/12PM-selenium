package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bank {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/ ");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement txtid=driver.findElement(By.xpath("//input[@type='text']"));
		txtid.sendKeys("123456");
		
		
		
		
	}

}
