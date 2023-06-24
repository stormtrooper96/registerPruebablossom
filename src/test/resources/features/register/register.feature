Feature: User Registration
  As a user
  I want to register on the page
  To create my account and access the features

  Scenario Outline: Successful registration with all required fields
    Given Jhon is on the registration page
    When Jhon enters his first name as "<First Name>" and his last name as "<Last Name>" and his address as "<Address>"
    And Jhon enters his city as "<City>" and his state as "<State>" and his zip code as "<Zip Code>"
    And Jhon enters his phone number as "<Phone Number>"
    And Jhon enters his SSN as "<SSN>"
    And Jhon enters his username as "<Username>" with random number , his password as "<Password>" and his confirm password as "<Confirm Password>"
    And Jhon clicks on the register button
    Then Jhon should see a registration success message
    Then Jhon takes a screenshot of the registration success message
    Examples:
      | First Name | Last Name | Address | City | State | Zip Code | Phone Number | SSN | Username | Password | Confirm Password |
      | John | Doe | 123 Main St | Miami | FL | 12345 | 1234567890 | 3123456789 | JohnDoe4 | mypassword | mypassword |