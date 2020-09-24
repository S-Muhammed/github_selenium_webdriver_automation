package SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignInTest {

    private WebDriver driver;
    public void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://github.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("testingpreneur@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("new5func");
        driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[4]/input[9]")).click();
        Thread.sleep(10000);
        driver.quit();
    }
    public static void main(String args[]) throws InterruptedException {
        SignInTest test = new SignInTest();
        test.setUp();

    }
}
