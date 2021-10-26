package org.mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuru {
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();

		WebElement txtuser=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtuser.sendKeys("9003215831");
		
}
}