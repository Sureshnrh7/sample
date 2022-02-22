package com.sd.win.msteams;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WiniumDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesktopOptions option = new DesktopOptions();
		 
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		 
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
		 
		Thread.sleep(10000);
		 
		driver.findElement(By.name("Seven")).click();

		driver.findElement(By.name("Eight")).click();
		 
		driver.findElement(By.name("Equals")).click();
		 
		Thread.sleep(5000);
		 
		String output = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
		 
		System.out.println("Result after addition is: "+output);
		 
		
		 
		}
		
	
	}


