Feature: Login Functionality

  In order to do online shopping
  As a valid DemoBlaze customer
  I want to login successfully


#  Scenario: Login Successful
#
#    Given I am in the login page of the DemoBlaze Application
#    When  I enter valid credentials
#    Then I should be taken to the Logged page

  Scenario Outline: Login Successful

    Given I am in the login page of the DemoBlaze Application
    When  I enter valid <username> and <password>
    Then I should be taken to the Logged page

    Examples:
      |username|password|
      |"ArgenisPinto"|"abcdef"|
      |"ArgenisPintoTester"|"abcdef"|