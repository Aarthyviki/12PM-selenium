package org.mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.amazon.in");
	
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.manage().window().maximize();

	WebElement prime=driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
	
	Actions a=new Actions(driver);
	
	a.moveToElement(prime).perform();
	
	WebElement delivery=driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
	
	a.moveToElement(delivery).click().perform();
}
}