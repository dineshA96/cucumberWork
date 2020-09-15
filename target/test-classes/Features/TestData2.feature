Feature: Verifying the adactin functionalities

 Scenario Outline: Cancel Hotel Booking
  Given User2 is in the adactin page
  When User2 should enter "<userName>","<password>" and "<SearchOrderId>"
  And User2 should click the cancel button
  
    Examples:
      |userName|password|SearchOrderId|
      |dinesh96|adkakm|M78L7WYV7I|

