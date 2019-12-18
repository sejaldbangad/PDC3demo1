Feature: my validations on mercury application

  Background: Launch the website
    Given application is launched

  @Sanity
  Scenario: user access to signup in website
    Given Mercury website is launched
    And user clicks on sign up button
    When user enters proper data
    Then clicks on submit button for account creation

  @Sanity
  Scenario Outline: user access to login
    Given registered user clicks on login link
    Then he provides valid username "<uname>"
    And he provides valid password "<pwd>"
    Then login successful

    Examples: 
      | uname       | pwd    |
      | abc@efg.com | 123456 |
      | paa@raa.com | 123456 |
      | n@s.com     | 123789 |

  @smoke
  Scenario: user access to bok flight
    Given user verifies the flights avaliable
    Then selects the desired flight
    When user makes the payment
    Then Tickets are generated
