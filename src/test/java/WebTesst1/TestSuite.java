package WebTesst1;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();

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


}