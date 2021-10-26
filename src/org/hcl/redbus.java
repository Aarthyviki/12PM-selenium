package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://www.redbus.in/");
		 
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement icon=driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
	    icon.click();
	    
	    Thread.sleep(5000);
	    
	   
	    
	    WebElement signcli=driver.findElement(By.xpath("//li[@id='signInLink']"));
	    signcli.click();
		
	    WebElement enter=driver.findElement(By.xpath("//input[@type='number']"));
	    enter.sendKeys("9003215831");
		
	    WebElement otp=driver.findElement(By.xpath("//div[@id='otp-container']"));
	    otp.click();

		
	}
}
