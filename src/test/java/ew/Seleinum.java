package ew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleinum
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.getCurrentUrl();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("name")).sendKeys("karthi");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("karthi980@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9807865468");
		
		driver.findElement(By.id("textarea")).sendKeys("Chennai, India");
		
		driver.findElement(By.xpath("//input[@id='Male']")).click();
		
		driver.findElement(By.xpath("//input[@id='Friday']")).click();
		
		driver.close();
}
}
