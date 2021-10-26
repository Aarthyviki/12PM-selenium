package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
       
	WebElement para=driver.findElement(By.xpath("//p[text()='He has 12+ years of total IT experience. Out of this, 10+ years in Selenium and QA Services working on various tools and techniques. In the last 10 years, Velmurugan have trained and placed 5000+ students in Selenium and supported many of his students to switch from non-technical field to technical field. ']"));
	System.out.println(para);
}
}