Feature: Login in SwagLabs with different set of Test data

  Scenario Outline: Login with Valid & InValid Credentials
    Given Browser is launched and application is open.
    When Provide "<username>" and "<password>".
    Then click on Login button.
    And Verify the Error or Success.
    And close the application.

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      | standard_user | secret_santa |
      | invalid_user  | secret_sauce |
      | invalid_user  | secret_santa |
