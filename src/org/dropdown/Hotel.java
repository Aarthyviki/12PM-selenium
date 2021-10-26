package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel {
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		WebElement fruits=driver.findElement(By.xpath("//select[@id='fruits']"));
		
		
		Select s=new Select(fruits);
		
		s.selectByIndex(0);
		
		s.selectByIndex(2);
		
		s.deselectByIndex(1);
		
		s.deselectByIndex(3);

}
}