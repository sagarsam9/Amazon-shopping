package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	static {
		System.setProperty ("webdriver.chrome.driver","C:\\Driver_Notes\\ChromeDriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wrist Watches");
		driver.findElement(By.xpath("(//div[@aria-label='wrist watches'])[1]")).click();
	
		 driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Analogue']")).click();
		 driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Leather']")).click();
		 driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Titan']")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'25% Off or more')]")).click();
		 driver.findElement(By.xpath("//img[@alt=\"Titan Neo Iv Analog Black Dial Men's Watch-NL1802NL01\"]")).click();
		 
	driver.close();

	}

}
