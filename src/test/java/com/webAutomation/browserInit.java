package com.webAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserInit {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khushi\\Downloads\\RestAssuredDemo\\webAutomation\\src\\test\\resources\\Drivers\\chromedriver.exe");
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Khushi\\Downloads\\RestAssuredDemo\\webAutomation\\src\\test\\resources\\Drivers\\msedgedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Khushi\\Downloads\\RestAssuredDemo\\webAutomation\\src\\test\\resources\\Drivers\\\\geckodriver.exe");
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
