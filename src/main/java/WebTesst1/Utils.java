package WebTesst1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static void sendText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    private static void selectTextFromDropDown(By by, String text) {
        Select select = new Select(driver.findElement(by));
    }

    public static String timestamp() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        Date date = new Date();
        return (dateFormat.format(date));
    }


    public static void assertTextMessage(String message, String expected, By by) {
        String actual = getTextFromElement(by);
        Assert.assertEquals(message, expected, actual);
    }

    public static void assertURL(String text) {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    //creating method for select From Drop Down By Visible Text
    public static void selectFromDropDownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

}




