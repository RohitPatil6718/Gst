Feature: Testing only login

  Background: 
    Given he lands there

  Scenario Outline: he enters his cred
    Then they enters username & pass
    And They clicks on login btn
