package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	 
	driver.manage().window().maximize();
	
	String title=driver.getTitle();
	System.out.println(title);
	
	WebElement model=driver.findElement(By.xpath("//div[@id='heading201']"));
    model.click();
    
    WebElement resume=driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]"));
    resume.click();
	
}

}
