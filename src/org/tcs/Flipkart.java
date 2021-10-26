package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));

		WebElement des=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions a=new Actions(driver);
	    a.dragAndDrop(src, des).perform();
	
	    WebElement src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));

		WebElement des1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		
	    a.dragAndDrop(src1, des1).perform();
	    
	    
	    
	    
	    
}
}