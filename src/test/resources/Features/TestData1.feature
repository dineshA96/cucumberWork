Feature: Verifying the adactin functionalities

 Scenario Outline: Verifying adactin details with valid credentials
  Given User1 is on the adactin page
  When User1 should enter "<userName>" and "<password>"
  And User1 should click the login button
  When User1 should select "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>" 
  And User1 should click the search button
  When User1 should select the radio button
  And User1 should click the continue button
  When User1 should Enter "<First Name>","<Last Name>","<Billing Address>","<Credit Card No>","<Credit Card Type>","<Expiry Date Month>","<Expiry Date Year>","<CVV Number>"
  And User1 should click the Book Now button 
  Then User1 should verify Order No
  And User1 should click the myItinerary button
  And User1 should Enter orderId and click goButton
  Then User1 should select checkBox and cancelButton
  And User1 should handle the alert
    
     Examples:
      |userName|password|Location|Hotels|Room Type|Number of Rooms|Check In Date|Check Out Date|Adults per Room|Children per Room|First Name|Last Name|Billing Address|Credit Card No|Credit Card Type|Expiry Date Month|Expiry Date Year|CVV Number|
      |dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|1 - One|07/08/2020|10/08/2020|1 - One|2 - Two|Dinesh|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123| 