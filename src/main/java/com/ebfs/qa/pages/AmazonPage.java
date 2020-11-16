package com.ebfs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ebfs.qa.base.TestBase;
import com.ebfs.qa.properties.AmazonPageProperties;

public class AmazonPage extends TestBase{
	public void AccSiginIn() {
		Actions act=new Actions(driver);
		WebElement AcSignIn =driver.findElement(By.id(AmazonPageProperties.AccSignIn_id));
		act.moveToElement(AcSignIn);
	}
	public void SiginIn() {
		
		WebElement SignIn =driver.findElement(By.xpath(AmazonPageProperties.SignIn_xpath));
		           SignIn.click();

}
}