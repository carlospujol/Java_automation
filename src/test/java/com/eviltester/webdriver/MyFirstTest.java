package com.eviltester.webdriver;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyFirstTest {
  @Test
  public void startWebDriver(){
      WebDriver driver = new FirefoxDriver();
      driver.navigate().to("http://www.google.com");

      WebElement search = driver.findElement(By.name("q"));
      search.sendKeys("Cheese!");

      WebElement buttonk =driver.findElement(By.name("btnK"));
     if(buttonk.isDisplayed()){
         buttonk.click();
     }
     else{
         WebElement buttonSearch =driver.findElement(By.name("btnG"));
         buttonSearch.click();
     }
      driver.close();
  }

}
