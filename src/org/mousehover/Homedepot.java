package org.mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homedepot {
	
public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://www.snapdeal.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();

        WebElement mobile=driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		
		Actions a=new Actions(driver);
		
		a.moveToElement(mobile).perform();
		
        WebElement cover=driver.findElement(By.xpath("//span[text()='New Launches Covers']"));
		
		a.moveToElement(cover).click().perform();
	
	

}
}