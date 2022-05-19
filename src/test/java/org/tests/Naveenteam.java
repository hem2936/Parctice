package org.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naveenteam {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
       WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://www.flipkart.com/");
		
		WebElement findElement = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		findElement.click();
		
		driver.manage().window().maximize();
				
		WebElement findbtn = driver.findElement(By.name("q"));
		
		findbtn.sendKeys("mobiles");
//		Actions action = new Actions(driver);
//		action.moveToElement(findbtn);
//		WebElement findtv = driver.findElement(By.xpath("//a[text()='Televisions']"));
//		action.moveToElement(findtv);
//    	findtv.click();
//		
//		WebElement findTVS = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));		
//		action.moveToElement(findTVS);
//		
//		WebElement findMI = driver.findElement(By.xpath("//a[text()='Mi']"));
//		findMI.click();
//		
//		WebElement find1st = driver.findElement(By.xpath("//div[text()='Xiaomi 5A 80 cm (32 inch) HD Ready LED Smart Android TV with Dolby Audio (2022 Model)']"));
//		
//		find1st.getAccessibleName();
//		//System.out.println(accessibleName);
//		
//		find1st.getAttribute("Value");
//		
//		find1st.click();
//		
//		
//		
//		
	}
}
