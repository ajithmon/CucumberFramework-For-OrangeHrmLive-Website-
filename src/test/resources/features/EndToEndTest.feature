Feature: Verify end to end scenarios of the application orangehrmlive

  Scenario: Verify user can login and logout
    Given user open the website
    Then  verify user is on login page
    When  user can login with username "Admin" and password "admin123"
    Then  verify user is on application page
    When  user click on profile button
    And   user click on logout button
    Then  verify user is on login page

  Scenario: Verify user can create new user
    Given user open the website
    Then  verify user is on login page
    When  user can login with username "Admin" and password "admin123"
    Then  verify user is on application page
    When  user click on admin link
    Then  verify add button is present
    And   user click on add button
    When  user fill the user details
    And   user click on save button
    Then  verify success message displayed
    When  user click on search user button
    And   user fill search list
    Then  verify added item is present in search list
    When  user click on delete button on added item
    And   user click on confirmation message
    Then  Verify delete success message displayed

  Scenario: Verify user can create new candidate
    Given user open the website
    Then  verify user is on login page
    When  user can login with username "Admin" and password "admin123"
    Then  verify user is on application page
    When  user click on recruitment link
    Then  verify add button is present
    And   user click on add button
    When  user fill candidate details
    And   user click on save button
    Then  verify success message displayed
    When  user search the candidate name
    Then  verify added item is present in search list




