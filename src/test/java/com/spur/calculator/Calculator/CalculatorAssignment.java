package com.spur.calculator.Calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class CalculatorAssignment
{ 
	public WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
    WebDriverManager.chromedriver().setup();
    WebDriver driver;
    driver = new ChromeDriver();

	driver.get("https://www.calculator.net/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	//Multiplication
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='×']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='5']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='5']")).click();
	//Division
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='AC']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='/']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		
	//Addition
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='AC']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='–']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='+']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='5']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='5']")).click();
	//subtraction
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='AC']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='8']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='–']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='–']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='9']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='8']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
	
	}
}
