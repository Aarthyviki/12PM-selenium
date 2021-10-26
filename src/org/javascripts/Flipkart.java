package org.javascripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();

		
		WebElement txtuser=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		WebElement txtpass=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement btnlogin=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','Greens')",txtuser);
		js.executeScript("arguments[0].setAttribute('value','Greens@123')",txtpass);
		
		Object o=js.executeScript("return arguments[0].getAttribute('value')",txtuser);
		Object b=js.executeScript("return arguments[0].getAttribute('value')", txtpass);
		
		String s=(String)o;
		String d=(String)b;
		System.out.println(s);
		System.out.println(d);
		
		js.executeScript("arguments[0].click()", btnlogin);
		
		
}
}