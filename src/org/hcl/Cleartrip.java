package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		 
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement fromtxt=driver.findElement(By.xpath("//input[@title='From station']"));
	    fromtxt.sendKeys("Chennai");
	    
	    WebElement totxt=driver.findElement(By.xpath("//input[@title='To station']"));
	    totxt.sendKeys("Coimbatore");
	    
	    
	    WebElement search=driver.findElement(By.xpath("//button[@type='submit']"));
	    search.click();
	    
		
}
}