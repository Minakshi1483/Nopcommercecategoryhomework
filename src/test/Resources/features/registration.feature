
Feature:  user Should be Able to Register Successfully and see welcome message
  Scenario: user Should be Able to Register Successfully
    Given user should be register successfully when user filled compulsory field
    When user is on Home page
    And  user click on register button
    And user field all compulsory field
    Then  user should be register successfully



