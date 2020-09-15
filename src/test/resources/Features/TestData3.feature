Feature: Verifying the adactin functionalities

  Scenario Outline: Check the adactin details
    Given User3 is on adactin page
    When User3 should enter "<userName>","<password>"
    And User3 should select "<Location>","<Hotels>","<Room Type>","<Check In Date>","<Check Out Date>""<First Name>","<Last Name>","<Billing Address>","<Credit Card No>","<Expiry Date Month>","<Expiry Date Year>","<CVV Number>"
      | Number of Rooms | Adults per Room | Children per Room | Credit Card Type |
      | 1 - One         | 1 - One         | 0 - None          | VISA             |
      | 2 - Two         | 2 - Two         | 1 - One           | Master Card      |
      | 3 - Three       | 3 - Three       | 2 - Two           | American Express |
      | 4 - Four        | 4 - Four        | 3 - Three         | Other            |
      | 5 - Five        |                 | 4 - Four          |                  |
      | 6 - Six         |                 |                   |                  |
      | 7 - Seven       |                 |                   |                  |
      | 8 - Eight       |                 |                   |                  |
      | 9 - Nine        |                 |                   |                  |
      | 10 - Ten        |                 |                   |                  |
    And User3 should print the booking id

    Examples: 
      | userName | password | Location | Hotels         | Room Type | Check In Date | Check Out Date | First Name | Last Name | Billing Address | Credit Card No   | Expiry Date Month | Expiry Date Year | CVV Number |
      | dinesh96 | adkakm   | Sydney   | Hotel Sunshine | Deluxe    | 07/08/2020    | 10/08/2020     | Dinesh     | Kumar     | Vedaranyam      | 1122334455667788 | May               |             2022 |        123 |
