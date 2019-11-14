package com.example.dummy;


import org.junit.After;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@SpringBootTest
class DummyApplicationTests {

	WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	}

	@BeforeEach
	public void setup() {
		 driver = new ChromeDriver();
	}

	@AfterEach
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	void contextLoads() {
		driver.get("http://localhost:8080/");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div > h1")));
		Assertions.assertEquals(driver.findElement(By.cssSelector("#root > div > h1")).getText(),"Demo Project");
	}

}
