@wip
Feature: Basket Functionality

  Scenario: Verify that user should be able to add a correct book to basket
    Given I am on the main page
    When I type "Do One Thing" on search input and click on search button
    And I click "Do One Thing" title
    And I click add to basket button
    Then "Do One Thing" should be displayed on basket
