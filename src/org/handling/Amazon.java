package org.handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("iphones");
		
		
		
		String parentId=driver.getWindowHandle();
		
		Set<String> allwindows=driver.getWindowHandles();
		
		for(String eachId:allwindows) {
			
			if(!parentId.equals(eachId)) {
				driver.switchTo().window(eachId);
			}
		}
		
		WebElement login=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		login.click();
		
		Actions a=new Actions(driver);
		
		WebElement phone=driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		
		a.contextClick(phone).perform();
		
		
		Robot r =new Robot();
		
		for(int i=0;i<2;i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}