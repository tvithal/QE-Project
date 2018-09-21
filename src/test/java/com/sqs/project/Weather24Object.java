//package com.sqs.project;
//
//import org.junit.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//
//public class Weather24Object {
//
//    static WebDriver driver;
//
//    // locators for weather24
//    private By expandedforecastW24locator = By.xpath("//*[@id=\"ext-gen28\"]");
//
//
//
//    public Weather24Object(WebDriver driver)
//
//    {
//
//        this.driver = driver;
//    }
//
//
//
//    public void click7dayexpandedforecastW24(WebDriver driver) {
//
//        //System.out.println("Click Register Button");
//        driver.findElement(expandedforecastW24locator).click();
//    }
//
//
//
//    public void weathertest2(String citysearch_chzn)
//    {
//
//        // navigate to the next site and compare the high values there with what's in the list
//        driver.navigate().to("http://weather.news24.com/sa/durban");
//        //click7dayexpandedforecastW24(driver);
//        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"div7DayForecast\"]/div/div/div[2]"));
//
//
//
//    }
//
//
//}
