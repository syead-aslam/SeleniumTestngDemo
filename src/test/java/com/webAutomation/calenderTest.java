package com.webAutomation;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class calenderTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String month = "7";
		String day = "12";
		String year = "2027";
		String[] expectedList = {month,day,year};
		driver.findElement(By.cssSelector(".react-date-picker__calendar-button__icon.react-date-picker__button__icon")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//button/abbr[text()='"+day+"']")).click();
		String selectedmonth = driver.findElement(By.cssSelector(".react-date-picker__inputGroup__month")).getAttribute("value");
		String selectedday = driver.findElement(By.cssSelector(".react-date-picker__inputGroup__day")).getAttribute("value");
		String selectedyear = driver.findElement(By.cssSelector(".react-date-picker__inputGroup__year")).getAttribute("value");
		System.out.println(selectedmonth);
		System.out.println(selectedday);
		System.out.println(selectedyear);
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

		for(int i =0; i<actualList.size();i++)

		{

		System.out.println(actualList.get(i).getAttribute("value"));

		Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);

		}

		driver.close();
	}

}
