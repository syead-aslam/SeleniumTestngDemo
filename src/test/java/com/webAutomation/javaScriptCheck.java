package com.webAutomation;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class javaScriptCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		//xpath
		int n = driver.findElements(By.xpath("//div[@class='tableFixHead'] //tr/td[4]")).size();
		//using css
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		Thread.sleep(1000);
		int sum=0;
		for(int i=0 ; i < n ; i++)
		{
			int amount = Integer.parseInt(values.get(i).getText());
			sum+= amount;
		}
		System.out.println("Sum: "+sum);
		int amt = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		System.out.println("Amount: "+amt);
		Assert.assertEquals(sum, amt);
		driver.close();
		

	}

}
