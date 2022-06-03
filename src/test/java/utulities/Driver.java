package utulities;


    import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

    public class Driver {

        static WebDriver driver;

        public static WebDriver getDriver() {

            if (driver == null) {
                switch (ConfigReader.getProperty("browser")) {
                    case "chrome" :
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        break;
                    case "firefox" :
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                    case "edge" :
                        WebDriverManager.edgedriver().setup();
                        driver = new EdgeDriver();
                    case "headless-chrome" :
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                        break;
                    default:
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                }
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            return driver;
        }

        public static void closeDriver() {
            if (driver!=null){ //driver'a deger atanmissa
                driver.close();
                driver=null;
            }
        }
}
