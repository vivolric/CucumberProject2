  Feature: Social Media Functionality

    @SmokeTest
    Scenario: Verify Social Media URL
      Given Navigate to aoutomationpractice
      When Click on sing button and enter the username and password"FalcoN"
      Then User should login successfully
      Then Click on Facebook and verify title
      Then Click on Twitter and verify title
      Then Click on YouTube and verify title
      Then Click on Google and verify title

