package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resume {

public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		WebElement interview=driver.findElement(By.xpath("//div[@id='heading201']"));
		interview.click();
		
		WebElement resume=driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
		
		Actions a=new Actions(driver);
		
		a.contextClick(resume).perform();
		
		Robot r=new Robot();
		
		for(int i=0;i<3;i++) {
			

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		
		
		
		
	
}
}