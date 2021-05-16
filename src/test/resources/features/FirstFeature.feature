@FirstFeature
Feature: This is my first feature to test

  @FirstScenario
  Scenario: This is my first scenario to test A1
    Given Launch browser "CHROME"
    Given When i am on user page
    And Set Data "T1" value "Thread 1"

  @FirstScenario
  Scenario: This is my first scenario to test A2
    Given Launch browser "CHROME"
    Given When i am on user page
    Then application is up

  @FirstScenario @tearDown
  Scenario: This is my first scenario to test A3
    Given Launch browser "CHROME"
    Given When i am on user page
    And Get Data "T1"

