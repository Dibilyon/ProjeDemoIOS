Feature: onboarding
  @positive
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
  Scenario: TL - KDV
  When Products button is clicked
  And Create products button is clicked
  And Product type is selected as item
  And Product Name is filled in
  And Product Status is selected as selling
  And Currency type is selected as TL
  And Unit price is filled in
  And Unit type is selected as Unit
  And Select KDV
  And Tevkifat is verified as False
  And Scroll to End Page Action is performed
  And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: TL - KDV - TEVKİFAT
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as TL
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tevkifat is verified as true
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: TL - KDV - OTV
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as TL
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tax rate is selected as OTV
    And Tevkifat is verified as False
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: TL - KDV - OIV
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as TL
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tax rate is selected as OIV
    And Tevkifat is verified as False
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: TL - KDV - OTV Tevkifat
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as TL
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tax rate is selected as OTV
    And Tevkifat is verified as true
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: TL - KDV - OIV Tevkifat
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as TL
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tax rate is selected as OIV
    And Tevkifat is verified as true
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: TL - KDV - OIV - OTV - Tevkifat
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as TL
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tax rate is selected as OIV and OTV
    And Tevkifat is verified as true
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: USD - KDV
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Usd
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tevkifat is verified as False
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: USD - KDV - TEVKİFAT
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Usd
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tevkifat is verified as true
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario:  USD - KDV - OTV
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Usd
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tax rate is selected as OTV
    And Tevkifat is verified as False
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: USD - KDV - OTV Tevkifat
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Usd
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tax rate is selected as OTV
    And Tevkifat is verified as true
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: USD - KDV - OIV Tevkifat
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Usd
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tax rate is selected as OIV
    And Tevkifat is verified as true
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: USD - KDV - OIV - OTV - Tevkifat
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Usd
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tax rate is selected as OIV and OTV
    And Tevkifat is verified as true
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: EURO - KDV
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Euro
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tevkifat is verified as False
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: EURO - KDV - TEVKİFAT
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Euro
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tevkifat is verified as true
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario:  EURO - KDV - OTV
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Euro
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tax rate is selected as OTV
    And Tevkifat is verified as False
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: EURO - KDV - OIV
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Euro
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tax rate is selected as OIV
    And Tevkifat is verified as False
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: EURO - KDV - OTV Tevkifat
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Euro
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tax rate is selected as OTV
    And Tevkifat is verified as true
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: EURO - KDV - OIV Tevkifat
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Euro
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tax rate is selected as OIV
    And Tevkifat is verified as true
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: EURO - KDV - OIV - OTV - Tevkifat
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as item
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Euro
    And Unit price is filled in
    And Unit type is selected as Unit
    And Select KDV
    And Tax rate is selected as OIV and OTV
    And Tevkifat is verified as true
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: TL - KDV - Service
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as service
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as TL
    And Unit price is filled in
    And Unit Type is selected as Hour
    And Select KDV
    And Tevkifat is verified as False
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: TL - KDV - GV Stopaj - Service
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as service
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as TL
    And Unit price is filled in
    And Unit Type is selected as Hour
    And Select KDV
    And Tax rate is selected as Stopaj
    And Tevkifat is verified as False
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: TL - KDV - Tevkifat Service
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as service
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as TL
    And Unit price is filled in
    And Unit Type is selected as Hour
    And Select KDV
    And Tevkifat is verified as true
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: TL - KDV - GV Stopaj - Tevkifat - Service
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as service
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as TL
    And Unit price is filled in
    And Unit Type is selected as Hour
    And Select KDV
    And Tax rate is selected as Stopaj
    And Tevkifat is verified as true
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: USD - KDV - Service
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as service
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Usd
    And Unit price is filled in
    And Unit Type is selected as Hour
    And Select KDV
    And Tevkifat is verified as False
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: USD - KDV - GV Stopaj - Service
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as service
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Usd
    And Unit price is filled in
    And Unit Type is selected as Hour
    And Select KDV
    And Tax rate is selected as Stopaj
    And Tevkifat is verified as False
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: USD - KDV - GV Stopaj - Tevkifat - Service
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as service
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Usd
    And Unit price is filled in
    And Unit Type is selected as Hour
    And Select KDV
    And Tax rate is selected as Stopaj
    And Tevkifat is verified as true
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: EURO - KDV - Service
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as service
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Euro
    And Unit price is filled in
    And Unit Type is selected as Hour
    And Select KDV
    And Tevkifat is verified as False
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: EURO - KDV - GV Stopaj - Service
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as service
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Euro
    And Unit price is filled in
    And Unit Type is selected as Hour
    And Select KDV
    And Tax rate is selected as Stopaj
    And Tevkifat is verified as False
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified
  Scenario: EURO - KDV - GV Stopaj - Tevkifat - Service
    When Products button is clicked
    And Create products button is clicked
    And Product type is selected as service
    And Product Name is filled in
    And Product Status is selected as selling
    And Currency type is selected as Euro
    And Unit price is filled in
    And Unit Type is selected as Hour
    And Select KDV
    And Tax rate is selected as Stopaj
    And Tevkifat is verified as true
    And Scroll to End Page Action is performed
    And Product description is filled in
    And Product Code is filled in
    And Create Products Button is clicked
    Then Product Creation is verified