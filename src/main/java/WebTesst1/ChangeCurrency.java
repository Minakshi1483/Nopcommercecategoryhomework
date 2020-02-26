package WebTesst1;

import org.openqa.selenium.By;

public class ChangeCurrency extends Utils {

    private By _changeCurrency = By.xpath("//select[@id=\"customerCurrency\"]");

    //select and change Currency from US Dollar To Euro
    public void selectCurrencyUSDollarToEuro()
        {
        //select and change currency from Us dollar to Euro
     selectFromDropDownByVisibleText(_changeCurrency,"Euro");
        }


    //select and change Currency from  Euro To US Dollar
    public void selectCurrencyEuroToUSDollar()
        { selectFromDropDownByVisibleText(_changeCurrency,"Dollar");


}











}
