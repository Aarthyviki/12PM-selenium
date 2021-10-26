package org.mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Warehouse {
	
public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" http://greenstech.in/selenium-course-content.html");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		WebElement courses=driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		
		Actions a=new Actions(driver);
		
		a.moveToElement(courses).perform();
		
        WebElement ware=driver.findElement(By.xpath("//div[@title='Data Warehousing courses']"));
		
		a.moveToElement(ware).perform();

}
}