//package com.sqs.project;
//
//import static org.junit.Assert.assertTrue;
//import org.junit.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.concurrent.TimeUnit;
//
//public class WeatherSAObject {
//    static WebDriver driver;
//
//    public WeatherSAObject(WebDriver driver) {
//    }
//
//    @Before
//    public void testsetup() throws InterruptedException {
//
//        System.out.println("in testsetup ");
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student01\\Downloads\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//
//        String baseUrl = "http://www.weathersa.co.za/";
//        String expectedTitle = "weathersa";
//        driver.get(baseUrl);
//        String actualTitle = driver.getTitle();
//        System.out.println("Actual title is: " + actualTitle);
//        Assert.assertEquals(actualTitle, expectedTitle);
//
//        String baseUrl2 = "http://weather.news24.com/sa/durban";
//        String expectedTitle2 = "news24";
//        driver.get(baseUrl);
//        String actualTitle2 = driver.getTitle();
//        System.out.println("Actual title is: " + actualTitle);
//        Assert.assertEquals(actualTitle2, expectedTitle2);
//
//        Thread.sleep(2000);
//    }
//
//    @BeforeClass
//    public static void browsersetup() {
//
//
//    }
//
//
//    @Test
//    public void weathercompare()
//
//    {
//
//        WeatherSAObject WeatherSA;
//        WeatherSA = new WeatherSAObject(driver);
//        WeatherSA.w
//
//
//        Weather24Object Weather24;
//        Weather24 = new Weather24Object(driver);
//
//
//
//    }
//
//
//    @After
//    public void tearDown() {
//        driver.close();
//    }
//}
