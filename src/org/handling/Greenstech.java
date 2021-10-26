package org.handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenstech {
	
public static void main(String[] args) throws AWTException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.xpath("//div[@id='heading304']"));
        frame.click();
        
        WebElement test=driver.findElement(By.xpath("(//a[@title='Test papers training in chennai'])[26]"));
        test.click();
        
        String parentid=driver.getWindowHandle();
        
        Set<String>allwindows=driver.getWindowHandles();
        
        for(String eachid:allwindows) {
        if(!parentid.equals(eachid)) {
     	   
     	   driver.switchTo().window(eachid);
     	   
        }
        
        WebElement question=driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
        String s=question.getText();
        System.out.println(s);
 }
      
}
}