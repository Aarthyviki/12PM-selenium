package org.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get(" http://www.greenstechnologys.com");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
	}

}
