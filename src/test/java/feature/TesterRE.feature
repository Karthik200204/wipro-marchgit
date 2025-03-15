Feature: About Testers
  In order to get a high paid job
  As a Tester
  I want to learn Automation
 
  Scenario Outline: I am a "<testerType>" Tester
    Given I am a "<testerType>" Tester
    When I apply for a job
    Then I got a "<jobType>" paid job
    And I am "<satisfactionType>" satisfied with my salary
    But my parents are "<parentsSatisfaction>" satisfied
 
    Examples: 
      | testerType | jobType | satisfactionType | parentsSatisfaction |
      | Manual     | LESS    | low              | Average             |
      | Automation | HIGH    | highly           | highly              |
      | API        | MEDIUM  | quite            | Average             |
      | DataBase   | MEDIUM  | quite            | Average             |
      | Security   | High    | highly           | highly              |