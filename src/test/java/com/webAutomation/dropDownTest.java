package com.webAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdp = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select sl = new Select(staticdp);
		sl.selectByIndex(2);
		sl.selectByValue("AED");
		sl.getFirstSelectedOption();
		String s = sl.getFirstSelectedOption().getText();
		System.out.println(s);
		driver.quit();

	}

}
