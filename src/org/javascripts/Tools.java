package org.javascripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tools {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("http://greenstech.in/selenium-course-content.html");
				
				String title=driver.getTitle();
				System.out.println(title);
				
				
				driver.manage().window().maximize();
				
				WebElement frame=driver.findElement(By.xpath("//div[@id='heading304']"));
				
				JavascriptExecutor js=(JavascriptExecutor) driver;
				
				js.executeScript("arguments[0].scrollIntoView(false)", frame);
}
}