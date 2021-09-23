Feature: Print roles and competencies in ARC application

Scenario: Validate the ARC Points and Rank functionality
    Given User has logged in to ARC application using valid user credentials
    When User clicks on Points and print the top points in Leaderboard
    And User clicks on Rank and print the top rank in Leaderboard
    And User navigate to Career Advancement Framework screen
    And User selects QA from the drop down
    Then User prints the Roles and Competencies for all designation available in QA
    