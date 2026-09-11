import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class SetUp {
    WebDriver driver = null;
    Properties prop;
    String configPath = "configuration.properties";
    RegisrationPage registration = new RegisrationPage();
    FlightsPage flightsPage = new FlightsPage();
    ResultsPage resultsPage = new ResultsPage();
    BookingFlightPage bookingFlightPage = new BookingFlightPage();
    RelatedActions relatedActions = new RelatedActions();
    BookingInvoicePage bookingInvoicePage = new BookingInvoicePage();
    WebDriverWait wait;
    Select select;

    @BeforeTest
    //@Parameters("browser") /* If you want to use testng.xml file pass browser argument in open()
    // ,in switch() and comment the reading from config file lines (25-27)
    public void Open() throws Exception {
        prop = new Properties();
        InputStream input = new FileInputStream(configPath);
        prop.load(input);

        switch (prop.getProperty("browser")){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, 10);
    }

//    @AfterTest
//    public void Close() throws IOException {
//        prop = new Properties();
//        InputStream input = new FileInputStream(configPath);
//        prop.load(input);
//        relatedActions.screenShots(driver, prop.getProperty("browser"));
//        driver.close();
//    }
}
