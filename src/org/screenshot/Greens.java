package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	
	public static WebDriver driver;
	public static void screenshots(String name) throws IOException{
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		
		File src=tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\91978\\eclipse-workspace\\Selenium\\src\\Screenshot\\"+name+".jpg");
		
		FileUtils.copyFile(src, des);
	}
		
	public static void main(String[] args) throws IOException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		
	}
   
	
	

}
