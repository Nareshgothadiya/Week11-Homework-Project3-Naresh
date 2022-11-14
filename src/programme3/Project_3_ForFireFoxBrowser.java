package programme3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Project_3_ForFireFoxBrowser {

    public static void main(String[] args) {

        //Set Property
        System.setProperty("webdriver.gecko.drover", "drivers/geckodriver.exe");
        //Create object
        WebDriver driver = new FirefoxDriver();
        //Launch the URL
        driver.get("http://the-internet.herokuapp.com/login");
        //Maximise Window
        driver.manage().window().maximize();
        //give implicit time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print the title of the page
        System.out.println("The page title is :" + driver.getTitle());
        //print the current url
        System.out.println("The current url is :" + driver.getCurrentUrl());
        //print the page source elements
        System.out.println("The Page Source elements is :" + driver.getPageSource());
        //Find the Email field element and send the email
        WebElement userField = driver.findElement(By.id("username"));
        //Type email in to email field
        userField.sendKeys("primetest@gmail.com");
        //Find Password field elements
        WebElement passField = driver.findElement(By.id("password"));
        //Enter the password
        passField.sendKeys("naresh123");
        //Close the browser
        driver.quit();
    }
}
