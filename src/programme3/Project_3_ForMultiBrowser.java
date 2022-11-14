package programme3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Project_3_ForMultiBrowser {

    static String browser = "firefox";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver(); // WebDriver driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser");
        }
        //get page url
        driver.get(baseUrl);
        //Maximise window
        driver.manage().window().maximize();
        //give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //get title of the page
        System.out.println("the page title is :" + driver.getTitle());

        //get URL of the page
        System.out.println("The current URL is : " + driver.getCurrentUrl());

        //get page source detail
        System.out.println("The page source detai is :" + driver.getPageSource());

        //find email field elements and send the email
        WebElement loginField = driver.findElement(By.id("username"));
        loginField.sendKeys("testemail@gmail.com");

        //find password field and send password
        WebElement passField = driver.findElement(By.id("password"));
        passField.sendKeys("naresh1234");

        //Close the browser
        //driver.quit();
    }
}
