package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazom {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		 
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement product=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		product.sendKeys("iphone");
		
		WebElement search=driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();
		
}
}