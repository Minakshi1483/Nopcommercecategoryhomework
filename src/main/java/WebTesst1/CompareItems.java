package WebTesst1;

import org.openqa.selenium.By;

public class CompareItems {

    public class CompareItem extends Utils{

        private By Giftcards = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[7]/a");
        private By VirtualGiftCard = By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div[3]/div[2]/input[2]");
        private By PhysicalGiftCrd = By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div[2]/div[3]/div[2]/input[2]");

        private By CompareItems = By.linkText("product comparison");}


}
