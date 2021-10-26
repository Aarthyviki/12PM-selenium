package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		WebElement login=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		login.click();
		
		WebElement fashion=driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[2]"));
		
		Actions a=new Actions(driver);
		
		a.contextClick(fashion).perform();
		
		Robot r=new Robot();
		
		for(int i=0;i<5;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);		
		}
		
	
}
}