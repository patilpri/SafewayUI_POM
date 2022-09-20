Feature: SignIn Teats


  Scenario: test Signin with correct crdentials
    Given I go to Safeway HomePage
    And go to SignIn Page
    When I enter "correct" credentials
    Then User should be redirected to HomePage
    And User first name should be displayed on top