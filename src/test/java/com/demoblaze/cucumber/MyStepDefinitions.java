package com.demoblaze.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyStepDefinitions {

    private WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Given("I am in the login page of the DemoBlaze Application")
    public void iAmInTheLoginPageOfTheDemoBlazeApplication() {
        driver.get("https://www.demoblaze.com/");
    }

//    @When("I enter valid credentials")
//    public void iEnterValidCredentials() throws InterruptedException {
//        driver.findElement(By.id("login2")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("loginusername")).sendKeys("ArgenisPinto");
//        driver.findElement(By.id("loginpassword")).sendKeys("abcdef");
//        driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]")).click();
//    }

    @When("I enter valid {string} and {string}")
    public void iEnterValidCredentials(String username, String password) throws InterruptedException {
        driver.findElement(By.id("login2")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("loginusername")).sendKeys(username);
        driver.findElement(By.id("loginpassword")).sendKeys(password);
        driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]")).click();
    }

    @Then("I should be taken to the Logged page")
    public void iShouldBeTakenToTheLoggedPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("nameofuser")).isDisplayed();
        driver.findElement(By.linkText("Log out")).click();
    }

    @After
    public void quitBrowser(){
        driver.quit();
    }

}
