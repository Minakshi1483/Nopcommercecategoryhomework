package WebTesst1;

import org.openqa.selenium.By;


public class HomePage extends Utils {
    //click on Registen on home page
    private By _registerLink = By.xpath("//a[contains(., 'Register')]");

    //click on register
    public void clickOnRegisterButton() {
        clickOnElement(_registerLink);



        }

    }


