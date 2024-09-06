package com.webAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class autoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> Options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement Option : Options)
		{
			if (Option.getText().equalsIgnoreCase("India"))
			{
				Option.click();
				break;
			}
		}
		
		driver.close();

	}

}
