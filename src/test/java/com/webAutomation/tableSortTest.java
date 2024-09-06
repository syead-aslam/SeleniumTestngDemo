package com.webAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class tableSortTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//table/thead/tr/th[1]")).click();
		
		List<Object> price;
		
		do
		{
		List<WebElement> elementList = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		List<String> OriginalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(OriginalList);
		List<String> SortedList = OriginalList.stream().sorted().collect(Collectors.toList());
		System.out.println(SortedList);
		Assert.assertEquals(OriginalList, SortedList);
		
		price = elementList.stream().filter(s->s.getText().contains("Cheese")).map(s->getVeggiePrice(s)).collect(Collectors.toList());
		System.out.print(price);
		if(price.isEmpty())   
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}while(price.isEmpty());
		
		

	}

	private static Object getVeggiePrice(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
