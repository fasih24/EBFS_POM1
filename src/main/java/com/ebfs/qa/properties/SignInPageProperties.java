package com.ebfs.qa.properties;

public interface SignInPageProperties {
	
	public final String loginBtn_ClassName ="login";
	public final String signUPEmailTextBox_id="email_create";
	public final String submitBtn_xpath="//button[@name='SubmitCreate']//span";
	//public final String title_xpath="//div[@class='clearfix']//div[1]//label[1]";
	public final String signInEmailTexBox_id = "email";
//	public final String signInPwd_id = "passwd";
	public final String signInPwd_xpath= "//input[@id='passwd']";
	public final String signInBtn_xpath = "//button[@id='SubmitLogin']//span";
	
}
