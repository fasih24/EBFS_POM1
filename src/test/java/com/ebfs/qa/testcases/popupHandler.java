package com.ebfs.qa.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ebfs.qa.base.TestBase;


public class popupHandler{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\uddin\\eclipse-workspace\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("http://www.popuptest.com/goodpopups.html");
driver.findElement(By.xpath("//body//a[3]")).click();

Set <String> handler=driver.getWindowHandles();
Iterator<String> it=handler.iterator();
String parentWindow=it.next();
String childWindow=it.next();
driver.switchTo().window(childWindow);
System.out.println("childwindow  "+childWindow);
System.out.println("childwindow popup title "+driver.getTitle());
driver.close();
driver.switchTo().window(parentWindow);
System.out.println("parentWindow  "+parentWindow);
System.out.println("parentwindow  title "+driver.getTitle());
Thread.sleep(3000);
driver.close();

}
}
