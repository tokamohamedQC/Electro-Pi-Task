import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class OpenBrowser extends SetUp{
    SoftAssert softAssert = new SoftAssert();


    @Test(priority = 1, description = "User should be able to create account")
    public void Registration() throws Exception {
        driver.navigate().to(relatedActions.readStringFile(0, 0));
        registration.clickAgreement(driver);
        registration.FirstNameInputText(driver, relatedActions.readStringFile(1,0));
        registration.LastNameInputText(driver, relatedActions.readStringFile(2,0));
        registration.EmailInputText(driver, relatedActions.readStringFile(3,0));
        registration.PasswordInputText(driver, relatedActions.readStringFile(4,0));
        registration.confirmPasswordInputText(driver, relatedActions.readStringFile(4,0));
        registration.clickSignup(driver);
    }

    @Test(priority = 2, description = "Flight Reservation flow")
    public void flightReservation() throws Exception {
        driver.navigate().to(relatedActions.readStringFile(5, 0));
        registration.clickAgreement(driver);
        flightsPage.clickFromInputDropDown(driver);
        flightsPage.searchFromInputText(driver, relatedActions.readStringFile(6, 0));
        flightsPage.clickFromInputResult(driver);
        flightsPage.clickToInputDropDown(driver);
        flightsPage.searchToInputText(driver, relatedActions.readStringFile(7, 0));
        flightsPage.clickToInputResult(driver);
        flightsPage.clickDateField(driver);
        flightsPage.clickDateInput(driver);
        flightsPage.clickSearchButton(driver);
        softAssert.assertTrue(driver.getCurrentUrl().contains(flightsPage.getFromFieldResult(driver)), "The selected from field result is incorrect.");
        softAssert.assertTrue(driver.getCurrentUrl().contains(flightsPage.getToFieldResult(driver)), "The selected to field result is incorrect.");
        softAssert.assertTrue(resultsPage.isProgressbarDisplayed(driver), "The progress bar is not displayed.");
        resultsPage.clickBookNowBtn(driver);
        bookingFlightPage.enterFirstName(driver, relatedActions.readStringFile(1, 0));
        bookingFlightPage.enterLastName(driver, relatedActions.readStringFile(2, 0));
        bookingFlightPage.clickTitleOption(driver);
        bookingFlightPage.enterEmail(driver, relatedActions.readStringFile(3, 0));
        bookingFlightPage.clickCodeOption(driver);
        bookingFlightPage.enterPhone(driver, relatedActions.readStringFile(8, 0));
        bookingFlightPage.clickNationalityOption(driver);
        bookingFlightPage.enterPassportNumber(driver, relatedActions.readStringFile(9, 0));
        bookingFlightPage.clickcheckBtn(driver);
        bookingFlightPage.clickconfirmBtn(driver);
        softAssert.assertTrue(bookingInvoicePage.isInvoiceNumberDisplayed(driver), "The invoice number is not displayed.");
        softAssert.assertTrue(bookingInvoicePage.isInvoiceDetailsDisplayed(driver), "The invoice details is not displayed.");
        softAssert.assertAll();
    }

}
