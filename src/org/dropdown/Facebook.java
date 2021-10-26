package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
				

		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select s=new Select(country);
		
		
		
		
		
		
}
}