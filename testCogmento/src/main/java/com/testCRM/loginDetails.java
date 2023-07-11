package com.testCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginDetails {
	browserLaunch open=new browserLaunch();
	inputElements input=new inputElements();
	elementPath path=new elementPath();

	public void loginPage() {
		
		//signIn
		WebElement signIN=open.driver.findElement(By.xpath(path.signInButton));
		signIN.click();
		
		//username
		WebElement email=open.driver.findElement(By.xpath(path.emailSpace));
		email.sendKeys(input.email);
		
		//password
		WebElement password=open.driver.findElement(By.xpath(path.passwordSpace));
		password.sendKeys(input.password);
		
		//login
		WebElement loginButton=open.driver.findElement(By.xpath(path.loginButton));
		loginButton.click();
		
	}
	
}
