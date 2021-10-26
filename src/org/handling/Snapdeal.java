package org.handling;

import java.awt.AWTException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	
public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		search.sendKeys("iphone 7");
		
		WebElement login=driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		login.click();
		
		
        String parentId=driver.getWindowHandle();
		
		Set<String> allwindows=driver.getWindowHandles();
		
		for(String eachId:allwindows) {
			
			if(!parentId.equals(eachId)) {
				driver.switchTo().window(eachId);
			}
		}
		
		
		
	   WebElement phone=driver.findElement(By.xpath("//div[@id='632381666105']"));
	   phone.click();
		
	   
		
		
		
		

}
}