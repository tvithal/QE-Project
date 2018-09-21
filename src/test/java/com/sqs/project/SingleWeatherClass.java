package com.sqs.project;

import com.google.common.base.Verify;
import net.bytebuddy.asm.Advice;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.WebElement.*;


//todo - 1. wait until
//todo - 2. addtional cells

public class SingleWeatherClass {

    static WebDriver driver;

    private By searchlocator = By.xpath("//*[@id=\"mod-search-searchword\"]");
    private By expandedforecastW24locator = By.xpath("//*[@id=\"ext-gen28\"]");


    @Before
    public void testsetup() throws InterruptedException {
        //System.out.println("in testsetup ");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student01\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
        Thread.sleep(2000);

    }

    public void clickesearchlocator(WebDriver driver) {

        //System.out.println("Click Register Button");
        driver.findElement(searchlocator).click();
    }

    public void click7dayexpandedforecastW24(WebDriver driver) {

        //System.out.println("Click Register Button");
        driver.findElement(expandedforecastW24locator).click();
    }


    @Test
    public void weathertemps() throws InterruptedException {

        /////////////////////////////navigate to the first site and get the high temp values you want to compare
        driver.navigate().to("http://www.weathersa.co.za/");
        clickesearchlocator(driver);
        driver.findElement(By.xpath("//*[@id=\"mod-search-searchword\"]")).sendKeys("Durban (Greyville)  ");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mod-search-searchword\"]")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//*[@id=\"mod-search-searchword\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"searchicolink\"]")).click();
        Thread.sleep(2000);


        ////////////////////////////////////// method 1.1
        WebElement elementsunmax1 = driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div[3]/table[1]/tbody/tr[3]/td[2]"));
        List<String> pageOneValues = new ArrayList<>();
        pageOneValues.add(elementsunmax1.getText());

        WebElement elementsunmin1 = driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div[3]/table[1]/tbody/tr[5]/td[2]"));
        List<String> pageOneValues2 = new ArrayList<>();
        pageOneValues2.add(elementsunmin1.getText());


        ///////////////////////// navigate to the next site and compare the values there with what's in the list

        driver.navigate().to("http://weather.news24.com/sa/durban");
        click7dayexpandedforecastW24(driver);
        Thread.sleep(2000);


        ////////////////////////////////////// method 1.2
        WebElement elementsunmax2 = driver.findElement(By.xpath("//*[@id=\"forecastContent\"]/table/tbody/tr[3]/td[4]"));
        WebElement elementsunmin2 = driver.findElement(By.xpath("//*[@id=\"forecastContent\"]/table/tbody/tr[3]/td[5]"));

        Assert.assertEquals(pageOneValues.get(0), elementsunmax2.getText());

        try{
            Assert.assertEquals(true, false);
        }catch(AssertionError e)
        {
            System.out.println("Assertion error. ");
        }

        Assert.assertEquals(pageOneValues2.get(0), elementsunmin2.getText());



        System.out.println("Test Completed.");



        /////////////////////////////////////// method 2.1 - Grab the table 1 data
//        WebElement table = driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div[3]/table[1]"));
//        // Now get all the TR elements from the table
//        List<WebElement> allRows = table.findElements(By.tagName("tr"));
//        System.out.println("Number of rows is " + allRows.size());
//        // And iterate over them, getting the cells
//        for (WebElement row : allRows) {
//            List<WebElement> cells = row.findElements(By.tagName("td"));
//            // Print the contents of each cell
//            for (WebElement cell : cells) {
//                System.out.println("cell data 1: " + cell.getText());
//            }
//        }
//        System.out.println("\n\n");


//       /////////////////////////////////////////////////////// method 2.2 Grab the table 2 data
//        WebElement table2 = driver.findElement(By.xpath("//*[@id=\"forecastContent\"]"));
//
//        // Now get all the TR elements from the table
//        List<WebElement> allRows2 = table2.findElements(By.tagName("tr"));
//        System.out.println("Number of rows is " + allRows2.size());
//
//        // And iterate over them, getting the cells
//        for (WebElement row : allRows2) {
//            List<WebElement> cells = row.findElements(By.tagName("td"));
//
//
//            // Print the contents of each cell
//            for (WebElement cell : cells) {
//                System.out.println("cell data2 " + cell.getText());
//            }
//        }
//        ///////////////////////////////////////////////////////////////////////////////////////////////


            //Get number of rows In table.
//            int Row_count = driver.findElements(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div[3]/table[1]")).size();
//            System.out.println("Number Of Rows = "+Row_count);
//
//            //Get number of columns In table.
//            int Col_count = driver.findElements(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div[3]/table[1]")).size();
//            System.out.println("Number Of Columns = "+Col_count);
//
//            //divided xpath In three parts to pass Row_count and Col_count values.
//            String first_part = "//*[@id=\"akeeba-renderjoomla\"]/div[3]/table[1]";
//            String second_part = "]/td[";
//            String third_part = "]";
//
//            //Used for loop for number of rows.
//            for (int i=1; i<=Row_count; i++){
//                //Used for loop for number of columns.
//                for(int j=1; j<=Col_count; j++){
//                    //Prepared final xpath of specific cell as per values of i and j.
//                    String final_xpath = first_part+i+second_part+j+third_part;
//                    //Will retrieve value from located cell and print It.
//                    String Table_data = driver.findElement(By.xpath(final_xpath)).getText();
//                    System.out.print(Table_data +"  ");
//                }
//                System.out.println("");
//                System.out.println("");
//            }



    }



    @After
    public void tearDown()
    {
       driver.close();
    }

}

