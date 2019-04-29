package com.eggplant.step_def;

import com.eggplant.driver.DriverManager;
import com.eggplant.testcases.LoginLogTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoginSteps extends DriverManager {
    //  private LoginLogTest loginLogTest=new LoginLogTest();
    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() {
        String actUrl=driver.getCurrentUrl();
        assertThat(actUrl,is(containsString("google.com")));


    }

    @When("^User enters Username and Password$")
    public void user_enters_Username_and_Password() {
        driver.findElement(By.id("identifierId")).sendKeys("aryaavjewels@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        driver.findElement(By.name("password")).sendKeys("suratindia0987654321");

    }

    @When("^Clicks Go button$")
    public void clicks_Go_button(){
        driver.findElement(By.id("passwordNext")).click();

    }

    @Then("^User should logged in gmail acount$")
    public void user_should_logged_in_gmail_acount(){
        String logo
                =driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[1]/div[4]/div/a/img")).getText();

    }
    @When("^User Click LogOut button$")
    public void user_Click_LogOut_button(){

        driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
    }

    @Then("^User should successful Logged out from gmail acount$")
    public void user_should_successful_Logged_out_from_gmail_acount(){
       String title =driver.getTitle();
        System.out.println(title);
        System.out.println("successfull logged out");

    }


}
