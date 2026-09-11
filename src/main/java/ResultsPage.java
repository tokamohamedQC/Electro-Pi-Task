import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultsPage{


    public WebElement ProgressBarElement(WebDriver driver){
        By progress_bar = By.xpath("//div[@x-show=\"showProgressBar\"]");
        WebElement progressElement = driver.findElement(progress_bar);
        return progressElement;
    }

    public WebElement BookNowButtonElement(WebDriver driver){
        By bookBtn = By.xpath("(//span[text()='flight_takeoff'])[7]");
        WebElement bookBtnElement = driver.findElement(bookBtn);
        return bookBtnElement;
    }

    public boolean isProgressbarDisplayed(WebDriver driver){
        return ProgressBarElement(driver).isDisplayed();
    }

    public void clickBookNowBtn(WebDriver driver){
        BookNowButtonElement(driver).click();
    }
}
