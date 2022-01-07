package com.page.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.page.classes.LoginPage;
public class LoginPageTest {

@Test
public void verifyLogo() {
System.setProperty("webdriver.chrome.driver",
 "C:\\Users\\wwwaj\\Downloads\\chromedriver_win32\\chromedriver.exe");

 WebDriver driver= new ChromeDriver();
 LoginPage loginpage = new LoginPage(driver);
 driver.manage().window().maximize();
 driver.get("https://opensourcedemo.orangehrmlive.com/index.php/auth/validateCredentials");
 boolean flag=loginpage.validateLogo();
 AssertJUnit.assertTrue(flag);
}

@Test
public void verifyLogin() {
System.setProperty("webdriver.chrome.driver",
 "C:\\Users\\wwwaj\\Downloads\\chromedriver_win32\\chromedriver.exe");

 WebDriver driver= new ChromeDriver();
 LoginPage loginpage = new LoginPage(driver);
 driver.manage().window().maximize();
 driver.get("https://opensourcedemo.orangehrmlive.com/index.php/auth/validateCredentials");
 loginpage.login();

 String actualURL= driver.getCurrentUrl();
 
 String expectedURL= "https://opensourcedemo.orangehrmlive.com/index.php/dashboard";
 AssertJUnit.assertEquals(actualURL, expectedURL);
}
// @AfterMethod
// public void tearDown() {
// driver.close();
}