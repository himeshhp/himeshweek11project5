import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String url = "https://courses.ultimateqa.com/users/sign_in";

        //Set Chrome driver path
        System.setProperty("webdriver.chrome.driver", "drivers/msedgedriver.exe");

        //Start Chrome browser
        WebDriver driver = new EdgeDriver();

        //Open url
        driver.get(url);

        //Get title of loaded page
        System.out.println("Page Title is: " + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Get web elements or page source
        System.out.println("Page Source is: " + driver.getPageSource());

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
