package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
    driver.get(" http://greenstech.in/selenium-course-content.html");
    
    driver.manage().window().maximize();
    
   String title= driver.getTitle();
	System.out.println(title);
	
	WebElement question=driver.findElement(By.xpath("//div[@id='heading20']"));
	question.click();
	
	WebElement cts=driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
	cts.click();
	
	
	
	}

}
