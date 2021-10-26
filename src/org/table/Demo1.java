package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	
		
		public static void main(String[] args) {
			
			

			System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get(" http://demo.guru99.com/test/write-xpath-table.html ");
			
			String title=driver.getTitle();
			System.out.println(title);
			
			driver.manage().window().maximize();
			
			
			WebElement table=driver.findElement(By.xpath("//table[@border='l']"));
			
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			
			
			System.out.println(rows.size());
	           
				
				}
			}


