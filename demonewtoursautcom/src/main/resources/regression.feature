
  Feature: regression pack

    @register
      Scenario: register
      Given I am on homepage
      And I click on register
      And I enter username as "eastham" and password as "eastham"
      And I select register button
      Then I should be successfully registered


    @login
    Scenario: login as an user
      Given as an user I am on homepage
      And I login with username as "eastham" and password as "eastham"
      And I click on signIn button
      Then I should be successfully logged in

      @endtoend
      Scenario Outline:
        Given as an user I am on flight finder page
        When i select journey type "<journey type>"
        And i select passengers "<passengers>"
        And i select depart from "<departing from>"
        And i select depart to "<departing to>"
        And i select class "<class>"
        And i select airline "<airline>"
        And i click on continue button
        Then i should see "Blue Skies Airlines 360"
        And i click continue button
        And type in first name "<first name>" and last name "<last name>"
        And i click on secure purchase button
        Then I should my itinery should be booked succesfully

        Examples:
        | journey type| passengers | depart from    | depart to   | class           | airline               |
        | one way     | 1          | Acapulco       | New York    | Economy class   | Blue Skies Airlines   |

        Examples:
        | first name  | last name  |
        | Mike        | Smith      |





