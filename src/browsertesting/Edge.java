package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;

public class Edge {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

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

        //Find the username field element and send the Username
        WebElement emailField = driver.findElement(By.name("username"));
        //Type Username
        emailField.sendKeys("Admin");

        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //Close the browser
        driver.close();


    }
}
