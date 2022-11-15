package browsertesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Chrome {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launch the URL
        driver.get(baseUrl);
        //Maximise window
        driver.manage().window().maximize();
        //Get the title of the page
        String title = driver.getTitle();
       System.out.println("Page title is :"+title);


        //Get current Url
        System.out.println("Current URL : "+driver.getCurrentUrl());

        //Get page Source
        System.out.println("Page Source : "+driver.getPageSource());

        //Navigate to Login page by clicking on login Link
       // WebElement loginLink = driver.findElement(By.linkText("Log in"));
       // loginLink.click();
        //Find the email field element and send the email
        WebElement emailField = driver.findElement(By.name("username"));
        //Type email to end email
        emailField.sendKeys("Admin");

        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //Close the browser
        driver.close();


    }
}
