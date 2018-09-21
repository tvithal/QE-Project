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
//public class WeatherSAObject {
//
//    static WebDriver driver;
//
//    // dropdownbox variable
//    private By City = By.name("citysearch_chzn");
//    // locators for weathersa
//    private By weathersadropdownlocator = By.xpath("//*[@id=\"citysearch_chzn\"]/a/span");
//    private By weathersasetfavouritelocator = By.xpath("//*[@id=\"settofavorite\"]");
//
//
//    public WeatherSAObject(WebDriver WebDriver driver)
//
//    {
//
//        this.driver = WeatherSAObject.driver;
//    }
//
//
//
//    public void clickweathersadropdownlocator(WebDriver driver) {
//
//        System.out.println("Click dropdown Button");
//        driver.findElement(weathersadropdownlocator).click();
//    }
//
//
//
//    public void clickweathersasetfavouritelocator(WebDriver driver) {
//
//        System.out.println("Click dropdown Button");
//        driver.findElement(weathersasetfavouritelocator).click();
//    }
//
//
//
//    public void weathertest(String citysearch_chzn)
//
//    {
//
//        //navigate to the first site and get the high temp values you want to compare
//        driver.navigate().to("http://www.weathersa.co.za/");
//        clickweathersadropdownlocator(driver);
//        driver.findElement(City).sendKeys(citysearch_chzn);
//        WebElement element = driver.findElement(By.xpath("//*[@id=\"feed-tabs\"]/ul/li[2]/div/div[2]/div/span[1]"));
//        List<String> pageOneValues = new ArrayList<>();
//        pageOneValues.add(element.getText());
//        // add more values to the list here as needed
//
//    }
//
//
//
//}
