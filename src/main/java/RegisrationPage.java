import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class RegisrationPage {
    Random random = new Random();
    int rand = random.nextInt(100000);

    public WebElement Agreement(WebDriver driver){
        By FN_input = By.id("acknowledgeDemoWarning");
        WebElement AgreementElement = driver.findElement(FN_input);
        return AgreementElement;
    }

    public WebElement FirstNameInput(WebDriver driver){
        By FN_input = By.id("first_name");
        WebElement FirstNameElement = driver.findElement(FN_input);
        return FirstNameElement;
    }

    public WebElement LastNameInput(WebDriver driver){
        By LN_input = By.id("last_name");
        WebElement LN_InputElement = driver.findElement(LN_input);
        return LN_InputElement;
    }


    public WebElement EmailInput(WebDriver driver){
        By email_input = By.id("email");
        WebElement email_InputElement = driver.findElement(email_input);
        return email_InputElement;
    }

    public WebElement PasswordInput(WebDriver driver){
        By password_input = By.id("password");
        WebElement password_InputElement = driver.findElement(password_input);
        return password_InputElement;
    }

    public WebElement confirmPasswordInput(WebDriver driver){
        By password_input = By.id("confirm_password");
        WebElement confirmpassword_InputElement = driver.findElement(password_input);
        return confirmpassword_InputElement;
    }

    

    public WebElement SignUpButton (WebDriver driver){
        By createAccount_button = By.xpath("//button[@type='submit']");
        WebElement createAccount = driver.findElement(createAccount_button);
        return createAccount;
    }

    public void clickAgreement(WebDriver driver){
        Agreement(driver).click();
    }


    public void FirstNameInputText(WebDriver driver, String text){
        FirstNameInput(driver).sendKeys(text);
    }

    public void LastNameInputText(WebDriver driver, String text){
        LastNameInput(driver).sendKeys(text);
    }




    public void EmailInputText(WebDriver driver, String text){
        EmailInput(driver).sendKeys(text + rand +".com");
    }

    public void PasswordInputText(WebDriver driver, String text){
        PasswordInput(driver).sendKeys(text);
    }

    public void confirmPasswordInputText(WebDriver driver, String text){
        confirmPasswordInput(driver).sendKeys(text);
    }

    public void clickSignup(WebDriver driver){
        SignUpButton(driver).click();
    }


}
