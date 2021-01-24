Feature: Verifying Login functionality with Valid & Invalid User Credentials

  #Test Objective
  Scenario: Verify that user is able to launch the application with valid url.
    #Action Steps
    Given I want to launch chrome Brower.
    When I use valid URL of the Application in browser address bar.
    #Validation Steps
    Then User should be able to launch the application and login page should be displayed.
    And User closes the browser and application

  Scenario: Verify that user is able to login with Valid credentials.
    Given Launch the application with valid URL.
    When Provide valid "standard_user" in username text box.
    And Provide valid "secret_sauce" in password textbox.
    And Click on Login button.
    Then User should be able to login into the application successfully.
    And Products Page should be displayed.
    Then Close the browser.
