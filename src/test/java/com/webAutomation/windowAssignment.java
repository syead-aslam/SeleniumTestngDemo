package com.webAutomation;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> Itr = windows.iterator();
		String ParentId= Itr.next();
		String ChildId = Itr.next();
		driver.switchTo().window(ChildId);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
		driver.switchTo().window(ParentId);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText().split("Click")[0]);
		driver.quit();

	}

}
