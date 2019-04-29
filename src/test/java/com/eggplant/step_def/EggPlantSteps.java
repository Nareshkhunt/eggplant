package com.eggplant.step_def;

import com.eggplant.driver.DriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class EggPlantSteps extends DriverManager {
    @Given("^User is on Home Page of www\\.wikipedia\\.org$")
    public void user_is_on_Home_Page_of_www_wikipedia_org(){
        String homePageUrl=driver.getCurrentUrl();
        assertThat(homePageUrl,is(containsString("wikipedia")));

    }

    @When("^User type \"([^\"]*)\" in search box$")
    public void user_type_in_search_box(String item){
        driver.findElement(By.id("searchInput")).sendKeys(item);
        driver.findElement(By.cssSelector(".sprite.svg-search-icon")).click();

    }

    @Then("^the product description should be displayed$")
    public void the_product_description_should_be_displayed(){
        String actual=driver.findElement(By.id("firstHeading")).getText();
        assertThat(actual,is(equalToIgnoringCase("Schipperke")));
        Assert.assertEquals("page was found",actual,"Schipperke");


    }


}
