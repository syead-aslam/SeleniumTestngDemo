package com.webAutomation;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddToCart {
	
	public static void addItem(WebDriver driver,List<WebElement> selectToCart,String[] product)
	{
		int size = selectToCart.size();
		int n = product.length;
		int found = 0;
		for(int i =0 ; i < size ; i++)
		{
			
			List<String> ProductList = Arrays.asList(product) ;
			String[] productName = selectToCart.get(i).getText().split("-");
			String formatedName = productName[0].trim();
			if(ProductList.contains(formatedName))
			{
				found++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println(formatedName);
				if(found==n)
				{
					break;
				}
			}	
		}
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(5000));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> selectToCart = driver.findElements(By.xpath("//h4[@class='product-name']"));
		String[] product = {"Cauliflower","Pumpkin","Apple"};
		addItem(driver,selectToCart,product);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.className("promoCode")).click();
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		driver.quit();
	}

}
