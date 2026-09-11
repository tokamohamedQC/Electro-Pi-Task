import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookingInvoicePage {

    public WebElement InvoiceNumberElement(WebDriver driver){
        By Invoice_number = By.xpath("//span[contains(text(),'Invoice #')]");
        WebElement invoiceElement = driver.findElement(Invoice_number);
        return invoiceElement;
    }

    public WebElement InvoiceDetailsElement(WebDriver driver){
        By Invoice_title = By.xpath("//h3[text()='Invoice Details']");
        WebElement invoiceDetailsElement = driver.findElement(Invoice_title);
        return invoiceDetailsElement;
    }

    public boolean isInvoiceNumberDisplayed(WebDriver driver){
        return InvoiceNumberElement(driver).isDisplayed();
    }

    public boolean isInvoiceDetailsDisplayed(WebDriver driver){
        return InvoiceDetailsElement(driver).isDisplayed();
    }

}
