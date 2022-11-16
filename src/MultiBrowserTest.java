import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class MultiBrowserTest {
    static int browser;
    static String url = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select 1 to test in Chrome browser");
        System.out.println("Select 2 to test in Firefox browser");
        System.out.println("Select 3 to test in Edge browser");
        browser = sc.nextInt();

        if (browser == 1) {
            //set Chrome driver path
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            //start Chrome browser
            driver = new ChromeDriver();
        } else if (browser == 2) {
            //set FireFox driver path
            System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
            //start FireFox browser
            driver = new FirefoxDriver();
        } else if (browser == 3) {
            //set edge driver path
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            //start edge browser
            driver = new EdgeDriver();
        } else {
            System.out.println("Select valid option");
        }

        //Open url
        driver.get(url);

        //Get title of loaded page
        System.out.println("Page Title is: " + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Get web elements or page source
        System.out.println("Page Source is : " + driver.getPageSource());

        //Find and enter username in username field element
        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("test123@gmail.com");

        //Find and enter password in password field element
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("test123");

        //Close browser
        driver.quit();
    }
}
