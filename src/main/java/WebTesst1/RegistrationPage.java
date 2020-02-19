package WebTesst1;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {
   //enter firstName
    private By _firstName = By.id("FirstName");
    //enter lastName
    private By _lastName = By.id("LastName");
    //enter email
    private By _email = By.id("Email");
    //enter password
    private By _password = By.id("Password");
    //enter confirm password
    private By _confirmpassword = By.id("ConfirmPassword");
    //click on register button
    private By _registrationButton = By.id("register-button");
    //enter string firstname
    private String firstName = "Minakshi";
    //enter String ladtName
    private String lastName = "Shah";
    private static String timestamp = timestamp();

    public void VerifyUserIsOnRegisterPage() {

        assertURL("register");
    }
    public void UserEnterRegistartionDetails(){
        sendText(_firstName,firstName);
        sendText(_lastName, lastName);
        sendText(_email,"testtest"+timestamp+"@test.com");
        sendText(_password,"testtest");
        sendText(_confirmpassword,"testtest");
        clickOnElement(_registrationButton);
    }



}
