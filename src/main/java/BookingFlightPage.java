import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class BookingFlightPage {


    public WebElement titleField(WebDriver driver){
        By title = By.xpath("(//select)[1]");
        WebElement title_field = driver.findElement(title);
        return title_field;
    }

    public WebElement codeField(WebDriver driver){
        By code = By.xpath("(//select)[2]");
        WebElement code_field = driver.findElement(code);
        return code_field;
    }

    public WebElement nationalityField(WebDriver driver){
        By nationality = By.xpath("(//select)[4]");
        WebElement nationality_field = driver.findElement(nationality);
        return nationality_field;
    }

    public WebElement FirstNameFieldInput(WebDriver driver){
        By first_name_field = By.xpath("//input[@placeholder=\"Enter First Name\"]");
        WebElement firstNameElement = driver.findElement(first_name_field);
        return firstNameElement;
    }

    public void enterFirstName(WebDriver driver, String text){
        FirstNameFieldInput(driver).sendKeys(text);
    }

    public WebElement LastNameFieldInput(WebDriver driver){
        By last_name_field = By.xpath("//input[@placeholder=\"Enter Last Name\"]");
        WebElement lastNameElement = driver.findElement(last_name_field);
        return lastNameElement;
    }

    public void enterLastName(WebDriver driver, String text){LastNameFieldInput(driver).sendKeys(text);
    }

    public WebElement EmailFieldInput(WebDriver driver){
        By email_field = By.xpath("//input[@placeholder=\"Enter Email\"]");
        WebElement emailElement = driver.findElement(email_field);
        return emailElement;
    }

    public void enterEmail(WebDriver driver, String text){EmailFieldInput(driver).sendKeys(text);
    }

    public WebElement PhoneFieldInput(WebDriver driver){
        By phone_field = By.xpath("//input[@placeholder=\"Enter Phone Number\"]");
        WebElement phoneElement = driver.findElement(phone_field);
        return phoneElement;
    }

    public void enterPhone(WebDriver driver, String text){PhoneFieldInput(driver).sendKeys(text);
    }

    public WebElement PassportFieldInput(WebDriver driver){
        By passport_field = By.xpath("//input[@placeholder=\"6 - 15 Numbers\"]");
        WebElement passportElement = driver.findElement(passport_field);
        return passportElement;
    }

    public void enterPassportNumber(WebDriver driver, String text){PassportFieldInput(driver).sendKeys(text);
    }


    public void clickTitleOption(WebDriver driver) throws Exception{
                Select msOption = new Select(titleField(driver));
                msOption.selectByValue("Ms");
    }

    public void clickCodeOption(WebDriver driver) throws Exception{
        Select EGOption = new Select(codeField(driver));
        EGOption.selectByValue("EG");
    }

    public void clickNationalityOption(WebDriver driver) throws Exception{
        Select EgyptOption = new Select(nationalityField(driver));
        EgyptOption.selectByValue("EG");
    }

    public WebElement CheckBoxElement(WebDriver driver){
        By checkBtn = By.xpath("//div[@class=\"checkbox-container\"]");
        WebElement checkBtnElement = driver.findElement(checkBtn);
        return checkBtnElement;
    }

    public void clickcheckBtn(WebDriver driver){
        CheckBoxElement(driver).click();
    }

    public WebElement ConfirmBtnElement(WebDriver driver){
        By confirmBtn = By.xpath("//span[text()='Confirm Booking']");
        WebElement confirmBtnElement = driver.findElement(confirmBtn);
        return confirmBtnElement;
    }

    public void clickconfirmBtn(WebDriver driver){
        ConfirmBtnElement(driver).click();
    }


}
