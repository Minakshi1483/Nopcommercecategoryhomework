package WebTesst1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static javafx.scene.input.KeyCode.O;

public class TestSuite extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    // create changecurrency object
    ChangeCurrency changeCurrency =new ChangeCurrency();
    // create changecurrencyresultpage object
    ChangeCurrencyResultPage changeCurrencyResultPage =new ChangeCurrencyResultPage();



    @Test
    public void userShouldAbleToRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();
        //fill up registration details
        registrationPage.VerifyUserIsOnRegisterPage();
        registrationPage.UserEnterRegistartionDetails();
        //verify registration success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }

    @Test
    public void VeryfytoGetPriceListofFourproduct() {
        List<WebElement> productlist = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));

        for (WebElement we : productlist) {
            System.out.println(we.getText());

            Assert.assertTrue(we.getText().contains("£"));
        }

    }

    @Test

    public void userShouldBeAbleToChangeCurrecy()
    {

        changeCurrency.selectCurrencyUSDollarToEuro();
        changeCurrencyResultPage.verifycurrencyChangeUSDollarToEuro(driver);

        changeCurrency.selectCurrencyEuroToUSDollar();
        changeCurrencyResultPage.verifycurrencyChangeEuroToDollar(driver);


    }


@Test

public void guestUserShouldBeAbletoAddComments(){



    //guestUser.addComments();
    }
}





