package com.webAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframeAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
