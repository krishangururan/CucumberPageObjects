package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseSteps {

    protected WebDriver driver;
    public static ThreadLocal<WebDriver> dr=new ThreadLocal<>();
    protected void startWebDriver(String browser) {

        if(dr.get()==null) {
            switch (browser) {
                case "CHROME":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "FIREFOX":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "EDGE":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    System.out.println("No Driver is defined");
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            dr.set(driver);

        }
    }

    public static WebDriver getDriver(){
        return dr.get();
    }

    protected void navigate(String url) {
        getDriver().navigate().to(url);
    }

    protected void stopWebDriver() {
        if(getDriver()!=null) {
            getDriver().quit();
            dr.set(null);
        }
    }

}
