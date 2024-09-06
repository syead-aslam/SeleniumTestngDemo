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


public class SearchByStream {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Ch");
		List<WebElement> ElementList = driver.findElements(By.xpath("//tr/td[1]"));
		int ss= ElementList.size();
		System.out.println(ss);
		List<WebElement> ActualResult = ElementList.stream().filter(s->s.getText().contains("Ch")).collect(Collectors.toList());
		System.out.println(ActualResult.size());
		Assert.assertEquals(ElementList.size(), ActualResult.size());
		driver.close();

	}

}
