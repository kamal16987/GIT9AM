package com.dropdown.test;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Tamil\\GitHub-D1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		Thread.sleep(500);
		WebElement clk = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		clk.sendKeys("415628");
		WebElement ck = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		ck.sendKeys("78945");
		WebElement c = driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
		c.click();
		Alert al = driver.switchTo().alert();
		String out = al.getText();
		System.out.println(out);
}
