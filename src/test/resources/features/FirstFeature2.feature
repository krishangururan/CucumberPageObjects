@FirstFeature
Feature: This is my first feature to test 2

  @FirstScenario
  Scenario: This is my first scenario to test B1
    Given Launch browser "CHROME"
    Given When i am on user page
    And Set Data "T2" value "Thread 2"

  @FirstScenario
  Scenario: This is my first scenario to test B2
    Given Launch browser "CHROME"
    Given When i am on user page


  Scenario: This is my first scenario to test B3
    Given Launch browser "CHROME"
    Given When i am on user page
    And Get Data "T2"



