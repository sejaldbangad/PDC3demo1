 
Feature: Registeration on mercury application

Background: Launch the website 
 Given application is launched
 
 
@Sanity
Scenario: user registration on website
Given DemoWebShop website is launched
And user clicks on register button
When user enter details
Then clicks on submit button and register

 @Sanity
  Scenario Outline: user access to login  
    Given registered user clicks on login link
    Then he provides valid username "<uname>"
    And he provides valid password "<pwd>"
    Then login successful

    Examples: 
      | uname | pwd      |
      | sejal | sejal123 |
      | saavi | saavi24  |
      | namu  | namu12   |


@smoke
Scenario: user search items
Given user search for item
And user types the desired item
When user clicks on search button for the item
Then required item is displayed


Scenario: user access to cart 
Given user clicks on add to cart
And select required feature and quantity for item 
When user add the item
Then item is added to cart successfully





