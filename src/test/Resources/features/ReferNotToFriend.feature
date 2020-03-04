
Feature: Non Registered user should Not be Able To Refer a product To Friend
  @Test
  Scenario: Non Registered User Should Not Be Able To Refer a Product To Friend
    Given Non Registered user should not be able to refer a product
    When User is on home page and nevigate to different product category
    And User Click on any category
    And User Select product
    And User click on email a friend
    And User enter non register email address
    Then User should not able to email a friend and error messege should be  display
