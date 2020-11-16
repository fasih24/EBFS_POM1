package com.ebfs.qa.pages;

import com.ebfs.qa.properties.SignInPageProperties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebfs.qa.base.TestBase;

public class LogInPage extends TestBase {

	@FindBy(className =SignInPageProperties.loginBtn_ClassName)
	WebElement loginBtn;
	
	@FindBy(id = SignInPageProperties.signUPEmailTextBox_id)
	WebElement signUpEmailBox;
	@FindBy(xpath= SignInPageProperties.submitBtn_xpath)
	WebElement submitBtn;
	
	@FindBy(id= SignInPageProperties.signInEmailTexBox_id)
	WebElement signInEmailBox;
	@FindBy(xpath= SignInPageProperties.signInPwd_xpath)
	WebElement signInPwd;
	//@FindBy(xpath= SignInPageProperties.signInBtn_xpath)
	@FindBy(xpath= SignInPageProperties.signInBtn_xpath)
	WebElement signInBtn;
	
	public LogInPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	
	public void enterEmailToSignUp(String email) {
		signUpEmailBox.sendKeys(email);
	}
	public void createAccBtn() {
		submitBtn.click();
	}
	public void enterEmailTosignIn(String email) {
		signInEmailBox.sendKeys(email);
	}
	public void enterPasswdToSignIn(String pwd) {
		signInPwd.sendKeys(pwd);
		signInBtn.click();
	}
	
	
}
