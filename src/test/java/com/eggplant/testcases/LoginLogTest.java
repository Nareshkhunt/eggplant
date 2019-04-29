package com.eggplant.testcases;

import com.eggplant.Hooks;
import com.eggplant.driver.DriverManager;
import cucumber.api.java.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginLogTest extends DriverManager{
    public static void login(){
        driver.findElement(By.id("identifierId")).sendKeys("aryaavjewels@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        driver.findElement(By.name("password")).sendKeys("suratindia0987654321");
        driver.findElement(By.id("passwordNext")).click();

    }
    public static void logOut(){
        driver.findElement(By.xpath("//span[@class='gb_cb gbii']")).click();
        driver.findElement(By.xpath("//span[@class='gb_cb gbii']")).click();

    }

}
