@RegressionRetailAccount
Feature: Retail Account Page

  Background: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Ahmad.F.Ghafoor@tekschool.us' and password 'Tek@School1'
    And User click on login button
    Then User Should be logged in into Account

  @update
  Scenario: Verify User can update Profile information
    When User click on Account option
    And User update Name 'AhmahGaaridghafoor' and Phone '9198700300'
    And User click on Update button
    Then user profile information should be updated

  @addpaymentmethod
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2393393000000150 | Shad Gull  |              10 |           2029 |          203 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully'

  @editcards
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User picks card from Cards and Accounts section
    And User click on Edit option of card section
    And User edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 0300000259400730 | Shad bolum |               8 |           2042 |          100 |
    And User click on Update your card button
    Then a message should be displayed "Payment Method updated Successfully"

  @removecreditcard
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then Payment details should be removed

  @addAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And User fill new address form with below information
      | country      | fullName     | phoneNumber | streetAddress | apt      | city      | state      | zipCode      |
      | countryValue | countryValue | PhoneValue  | stAddress     | aptValue | cityValue | stateValue | zipCodeValue |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @editaddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And User fill new address form with below information
      | country      | fullName      | phoneNumber | streetAddress | apt      | city      | state      | zipCode      |
      | countryValue | fullnameValue | PhoneValue  | stAddress     | aptValue | cityValue | stateValue | zipCodeValue |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  @removeaddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
