import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightsPage {
WebDriver driver;
//WebDriverWait wait = new WebDriverWait(driver, 10);


    public WebElement FromInput(WebDriver driver){
        By from_input = By.xpath("//div[contains(@id,'fl_from_trigger')]");
        WebElement from_InputElement = driver.findElement(from_input);
        return from_InputElement;
    }

    public WebElement ToInput(WebDriver driver){
        By to_input = By.xpath("//div[contains(@id,'fl_to_trigger')]");
        WebElement to_InputElement = driver.findElement(to_input);
        return to_InputElement;
    }

    public WebElement FromSearchInput(WebDriver driver){
        By search_input = By.id("fl_from_q");
        WebElement search_InputElement = driver.findElement(search_input);
        return search_InputElement;
    }

    public WebElement ToSearchInput(WebDriver driver){
        By search_input = By.id("fl_to_q");
        WebElement search_InputElement = driver.findElement(search_input);
        return search_InputElement;
    }

    public WebElement FromSearchResult(WebDriver driver){
        By search_result = By.xpath("(//div[text()='Cairo, Egypt'])[2]");
        WebElement search_resultElement = driver.findElement(search_result);
        return search_resultElement;
    }

    public WebElement ToSearchResult(WebDriver driver){
        By search_result = By.xpath("((//div[contains(text(),'Saudi')]))[2]");
        WebElement search_resultElement = driver.findElement(search_result);
        return search_resultElement;
    }

    public WebElement DateElement(WebDriver driver){
        By date = By.id("date_container");
        WebElement dateInput = driver.findElement(date);
        return dateInput;
    }

    public WebElement DateInput(WebDriver driver){
        By date = By.xpath("(//td//div[not(contains(@class,'disabled'))])[1]");
        WebElement dateInput = driver.findElement(date);
        return dateInput;
    }

    public WebElement SearchElement(WebDriver driver){
        By search = By.xpath("//button[@title=\"Search Flights\"]");
        WebElement searchElement = driver.findElement(search);
        return searchElement;
    }


    public void clickFromInputDropDown(WebDriver driver){
        FromInput(driver).click();
    }

    public void clickToInputDropDown(WebDriver driver){
        ToInput(driver).click();
    }

    public void searchFromInputText(WebDriver driver, String text){
        FromSearchInput(driver).sendKeys(text);
    }

    public void searchToInputText(WebDriver driver, String text){
        ToSearchInput(driver).sendKeys(text);
    }


    public void clickFromInputResult(WebDriver driver){
        FromSearchResult(driver).click();
    }

    public void clickToInputResult(WebDriver driver){
        ToSearchResult(driver).click();
    }

    public void clickDateField(WebDriver driver){
        DateElement(driver).click();
    }

    public void clickDateInput(WebDriver driver){
        DateInput(driver).click();
    }

    public void clickSearchButton(WebDriver driver){
        SearchElement(driver).click();
    }

    public String getFromFieldResult(WebDriver driver){
        return FromSearchInput(driver).getText();
    }

    public String getToFieldResult(WebDriver driver){
        return ToSearchInput(driver).getText();
    }

}
