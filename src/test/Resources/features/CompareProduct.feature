
Feature: User should able to compare Two different Product Successfully
  @Test
  Scenario: User Should be Able to Compare Two Different Product Successfully
    Given User should be able to compare two different product
    When User should be on home page and navigate to  category
    And User click on two different product  add to compare list
    And User click on compare product
    Then User should be able to compare two different product


