package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialMedia extends ParentClass {

    public SocialMedia (){

        PageFactory.initElements(driver,this);
    }


    @FindBy (css = "#social_block>ul>:nth-child(1)>a")
    private WebElement Facebook;

    @FindBy (css = "#social_block>ul>:nth-child(2)>a")
    private WebElement Twitter;

    @FindBy (css = "#social_block>ul>:nth-child(3)>a")
    private WebElement YouTube;

    @FindBy (css = "#social_block>ul>:nth-child(4)>a")
    private WebElement Google;

    WebElement myElement;

    public void FindElementandClick(String ElementName){

        switch (ElementName){

            case "Facebook":
                myElement = Facebook;
                break;
            case "Twitter":
                myElement = Twitter;
                break;
            case "YouTube":
                myElement = YouTube;
                break;
            case "Google":
                myElement = Google;
                break;

        }


       switchToWindowAndGetTitle(myElement,ElementName);



    }


}
