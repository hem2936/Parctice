package org.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableMethod {
	WebDriver driver;
	public void Browser() {
		
		WebDriverManager.chromedriver().setup();
		
	     driver = new ChromeDriver();
			
	}
	
	public void openURL(String url) {
		
		driver.get(url);
	}
	
	public void maximize() {
		driver.manage().window().maximize();

	}
	
	public WebElement locateById(String id) {
		
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;

	}
	
	public WebElement lacteByname(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;

	}
	
	public void sendkey(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);

	}
	
	public void clicked(WebElement element) {
		element.click();
		

	}
	
}
	

