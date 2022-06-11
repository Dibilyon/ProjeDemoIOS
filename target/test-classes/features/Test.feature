Feature: Test
  Scenario: Onboarding
    When Arrow button on first page is clicked
    And Arrow button on second page is clicked
    And Arrow button on third page is clicked
    And Arrow button on fourth page is clicked
    And Arrow button on fifth page is clicked
    Then Login page is verified
  Scenario: Login
    When Login button is clicked
    And Phone number field is filled
    And Continue button is clicked
    And Password is filled in
    And Otp is filled in
    And Continue button is clicked
    And Home Page is verified
  Scenario: Create Category
    When Other button is clicked
    And Add Category Button is clicked
    And Category name is filled in
    And Icon select button is clicked
    And Icon is selected randomly
    And Color select button is clicked
    And Color is selected randomly
    And Save button is clicked
    Then Category Creation is verified
  Scenario: Create Contact
    When Contacts button is clicked
    And Create contacts button is clicked
    And Name field is filled in
    And Surname field is filled in
    And Email field is filled in
    And Phone number field is filled in
    And Norma No is filled in
    And Iban Number field is filled in
    And Tc no is filled in
    And City is selected
    And District is selected
    And Address field is filled in
    And Save Contact button is clicked
    Then Contact Creation is verified