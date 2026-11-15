package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogIntoHotelWebsite {

    WebDriver driver;
    @BeforeTest
    public void LoginHotel(){
        driver= new EdgeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void ClickHotelLoginButton () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 2)
    public void enterUsername(){
        driver.findElement(By.id("login-email")).sendKeys("njongoamg@gmail.com");
    }
    @Test(priority = 3)
    public void enterPassword(){
        driver.findElement(By.id("login-password")).sendKeys("@1234567");
    }
    @Test(priority = 4)
    public void clickSubmitButonForHotelLogin() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 5)
    public void clickLearnDropDown(){
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")).click();
    }
    @Test (priority = 6)
    public void verifyLoginSuccess(){
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[3]/button/span[2]")).isDisplayed();
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }


}
