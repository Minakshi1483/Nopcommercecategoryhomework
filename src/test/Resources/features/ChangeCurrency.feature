
Feature: Use should able to change currency
  @Test
  Given user should change currency
    When user is on homepage and navigate to different product category
    And user click and select Euro
    And user click and select Dollar
