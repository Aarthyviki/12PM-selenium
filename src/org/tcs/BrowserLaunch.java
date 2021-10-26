package org.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
		driver.get("http://greenstech.in/selenium-course-content.html\r\n");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
