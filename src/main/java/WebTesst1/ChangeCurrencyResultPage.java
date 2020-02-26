package WebTesst1;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.sql.Driver;
import java.util.List;

public class ChangeCurrencyResultPage {




    //Verify Currency Change From Us Dollar to Euro
    public void verifycurrencyChangeUSDollarToEuro(WebDriver driver){

        SoftAssert softAssert = new SoftAssert();
        List<WebElement> productPrice = driver.findElements(( By.xpath("//span[@class=\"price actual-price\"]")));
        for (WebElement we : productPrice)
            {
            softAssert.assertTrue(we.getText().contains("Ђ"), "Ђ  is not found in" + we.getText());
        }
        softAssert.assertAll();
        System.out.println("Please check your currency");
    }

    //Verify Currency Change From Euro To US Dollar
    public void verifycurrencyChangeEuroToDollar(WebDriver driver){
        SoftAssert softAssert = new SoftAssert();

        List<WebElement> productPrice = driver.findElements(( By.xpath("//span[@class=\"price actual-price\"]")));
        for (WebElement we : productPrice) {
            softAssert.assertTrue(we.getText().contains("$"), "$ is not found in" + we.getText());
        }
        softAssert.assertAll();
        System.out.println("Please check your currency");
    }

}









