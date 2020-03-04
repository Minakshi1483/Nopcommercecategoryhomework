
Feature: Guest User should be checkout successfully
  @Test
  Given guest user checkout successfully
    When guest user should be on homepage and navigate to different product category
    And Guest user click on product
    And Guest user product in add to cart
    And guest user click on checkout as a guest
    And guest user should able to do check out successfully
