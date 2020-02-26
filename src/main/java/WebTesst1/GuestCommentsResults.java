package WebTesst1;

import org.openqa.selenium.By;

import static WebTesst1.Utils.assertTextMessage;
import static WebTesst1.Utils.assertURL;

public class GuestCommentsResults {

    private By _assert1CommentSuccessMessage = By.linkText("News comment is successfully added");
    private By get_assert2UserCanSeeComments = By.linkText("2/24/2020 6:21 PM");

    String expected = "News comment is successfully added.";

    //String expected1 = ""

    public void  verifyGuestUserSeeCommentSuccessfulMessage()
    {
        assertURL("about-nopcommerce");
        assertTextMessage("You Should be registered Customer To Refer to a Friend",expected, _assert1CommentSuccessMessage);
        //assertTextMessage("Added Comments not Showing,expected,_assert2User");
    }



}
