Feature: Demonstrating Tags Concept in Cucumber

	@smoke
  Scenario: Smoke Tag
    Given Step One for Smoke
    When Step Two for Smoke
    Then Step three for Smoke
    And Step Four for Smoke
    Then Step Five for Smoke

	@regression
  Scenario: Regression Tag
    Given Step One for Regression
    When Step Two for Regression
    Then Step three for Regression
    And Step Four for Regression
    Then Step Five for Regression

	@functional
  Scenario: Functional Tag
    Given Step One for Functional
    When Step Two for Functional
    Then Step three for Functional
    And Step Four for Functional
    Then Step Five for Functional

	@nonfunctional
  Scenario: Non-Functional Tag
    Given Step One for Non-Functional
    When Step Two Non-Functional
    Then Step three Non-Functional
    And Step Four Non-Functional
    Then Step Five Non-Functional
