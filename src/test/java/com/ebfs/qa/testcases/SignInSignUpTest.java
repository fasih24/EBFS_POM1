package com.ebfs.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebfs.qa.base.TestBase;
import com.ebfs.qa.pages.ContactsPage;
import com.ebfs.qa.pages.HomePage;
import com.ebfs.qa.pages.LogInPage;
import com.ebfs.qa.util.TestUtil;

public class SignInSignUpTest extends TestBase {
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	LogInPage logInPage;
	
	public SignInSignUpTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();		
		homePage = new HomePage();
		logInPage = new LogInPage();
	}
	
	@Test(priority=1)
	public void signUp() {
		logInPage.clickOnLoginBtn();;
        logInPage.enterEmailToSignUp("abcdhgh@gmail.com");
		logInPage.createAccBtn();
		
	}
	@Test(priority=2)
	public void signIn() {
		logInPage.clickOnLoginBtn();
		logInPage.enterEmailTosignIn("uddin19uddin@yahoo.com");
		logInPage.enterPasswdToSignIn("12345");
		
	}
	
	@AfterMethod
	public void tearDown(){
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	
	
}
