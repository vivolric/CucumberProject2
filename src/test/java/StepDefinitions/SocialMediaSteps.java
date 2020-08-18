package StepDefinitions;

import POM.SocialMedia;
import cucumber.api.java.en.Then;

public class SocialMediaSteps {


    SocialMedia socialMedia = new SocialMedia();

    @Then("^Click on Facebook and verify title$")
    public void clik_on_Facebook_and_verify_title() {

      socialMedia.FindElementandClick("Facebook");
    }


    @Then("^Click on Twitter and verify title$")
    public void clickOnTwitterrAndVerifyTitle() {

        socialMedia.FindElementandClick("Twitter");

    }

    @Then("^Click on YouTube and verify title$")
    public void clickOnYouTubeAndVerifyTitle() {

        socialMedia.FindElementandClick("YouTube");

    }

    @Then("^Click on Google and verify title$")
    public void clickOnGoogleAndVerifyTitle() {

        socialMedia.FindElementandClick("Google");


    }
}
