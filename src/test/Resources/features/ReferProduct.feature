
Feature: Use should be Able to Refer a product to a Friend successfully
  @Test
  Scenario : User Should be Able To Refer a Product to a Friend  Successfully
    Given User should be able to refer a product to a friend
    When User is on home page and nevigate to different category
    And User Click on category
    And User Select product
    And User click on email a friend
    Then User should be able to email aProduct to a  friend successfully

