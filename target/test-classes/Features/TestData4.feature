Feature: Verifying the adactin functionalities

 Scenario Outline: Verifying adactin login details with valid credentials
  Given User on adactin page
  When User should enter "<userName>" and "<password>"
  And User should click the login button
  When User should select "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>" 
  And User should click the search button
  When User should select the radio button
  And User should click the continue button
  When User should Enter "<First Name>","<Last Name>","<Billing Address>","<Credit Card No>","<Credit Card Type>","<Expiry Date Month>","<Expiry Date Year>","<CVV Number>"
  And User should click the Book Now button 
  Then User should verify Order No
    
     Examples:
      |userName|password|Location|Hotels|Room Type|Number of Rooms|Check In Date|Check Out Date|Adults per Room|Children per Room|First Name|Last Name|Billing Address|Credit Card No|Credit Card Type|Expiry Date Month|Expiry Date Year|CVV Number|
      |dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|1 - One|07/08/2020|10/08/2020|1 - One|2 - Two|Dinesh|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|1 - One|07/08/2020|10/08/2020|2 - Two|2 - Two|Raj|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|1 - One|07/08/2020|10/08/2020|3 - Three|2 - Two|Prem|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|1 - One|07/08/2020|10/08/2020|4 - Four|2 - Two|Ram|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123|
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|1 - One|07/08/2020|10/08/2020|1 - One|0 - None|Dinesh|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|1 - One|07/08/2020|10/08/2020|1 - One|1 - One|Raj|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|1 - One|07/08/2020|10/08/2020|1 - One|2 - Two|Praveen|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|1 - One|07/08/2020|10/08/2020|1 - One|3 - Three|Ram|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123|
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|1 - One|07/08/2020|10/08/2020|1 - One|4 - Four|Dinesh|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123|
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|1 - One|07/08/2020|10/08/2020|1 - One|2 - Two|Dinesh|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|2 - Two|07/08/2020|10/08/2020|2 - Two|2 - Two|Raj|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|3 - Three|07/08/2020|10/08/2020|3 - Three|2 - Two|Prem|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|4 - Four|07/08/2020|10/08/2020|4 - Four|2 - Two|Ram|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123|
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|5 - Five|07/08/2020|10/08/2020|2 - Two|2 - Two|Raj|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|6 - Six|07/08/2020|10/08/2020|2 - Two|2 - Two|Raj|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|7 - Seven|07/08/2020|10/08/2020|3 - Three|2 - Two|Prem|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|8 - Eight|07/08/2020|10/08/2020|4 - Four|2 - Two|Ram|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123|
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|9 - Nine|07/08/2020|10/08/2020|1 - One|2 - Two|Dinesh|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|10 - Ten|07/08/2020|10/08/2020|2 - Two|2 - Two|Raj|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123|
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|1 - One|07/08/2020|10/08/2020|1 - One|2 - Two|Dinesh|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Super Deluxe|1 - One|07/08/2020|10/08/2020|2 - Two|2 - Two|Raj|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Standard|1 - One|07/08/2020|10/08/2020|3 - Three|2 - Two|Prem|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123|
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Double|1 - One|07/08/2020|10/08/2020|3 - Three|2 - Two|Ram|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123|
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Deluxe|1 - One|07/08/2020|10/08/2020|1 - One|2 - Two|Dinesh|Kumar|Vedaranyam|1122334455667788|Other|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Super Deluxe|1 - One|07/08/2020|10/08/2020|2 - Two|2 - Two|Raj|Kumar|Vedaranyam|1122334455667788|Master Card|May|2022|123| 
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Standard|1 - One|07/08/2020|10/08/2020|3 - Three|2 - Two|Prem|Kumar|Vedaranyam|1122334455667788|American Express|May|2022|123|
      #|dinesh96|adkakm|Sydney|Hotel Sunshine|Double|1 - One|07/08/2020|10/08/2020|3 - Three|2 - Two|Ram|Kumar|Vedaranyam|1122334455667788|VISA|May|2022|123|     