package com.webAutomation;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Cookie;

public class cookiesAndLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.manage().deleteCookieNamed("asbcd");
//		Cookie ck = new Cookie("asad","SAAD");
//		driver.manage().addCookie(ck);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		List<WebElement> links = driver.findElements(By.xpath("//li[contains(@class,'gf-li')]/a")); 
		SoftAssert a = new SoftAssert();
		for(WebElement link:links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<=400, "The link with Text: "+link.getText()+" is broken with code: " +respCode);
			
		}
		a.assertAll();
	}

}
