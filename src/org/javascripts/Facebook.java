package org.javascripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://en-gb.facebook.com");
				
				String title=driver.getTitle();
				System.out.println(title);
				
				
				driver.manage().window().maximize();
				
				WebElement txtuser=driver.findElement(By.xpath("//input[@type='text']"));
				WebElement txtpass=driver.findElement(By.xpath("//input[@type='password']"));
				WebElement btnlogin=driver.findElement(By.xpath("//button[@name='login']"));
				
				
				
				
				JavascriptExecutor js=(JavascriptExecutor) driver;
				
				js.executeScript("arguments[0].setAttribute('value','Greens')", txtuser);
				
				js.executeScript("arguments[0].setAttribute('value','Greens@123')", txtpass);
				
				js.executeScript("arguments[0].click()", btnlogin);
				
				

}
}