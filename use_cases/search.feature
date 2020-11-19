Feature: Search about suitable home
 Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)

 Given these homes are contained in the system

                |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR| 510_150_3_2_6|
                |APARTMENT_BRICK_CITY_NO_ELEVATOR|230_120_4_2_12|
                |APARTMENT_BRICK_CITY_VILLAGE_NO_SWIMMINGPOOL |100_120_4_2_6|
                |APARTMENT_STONE_VILLAGE_NO_SWIMMINGPOOL |150_120_3_2_12|
                
                
      
  
  
  
  
  
  
@betweenrangeofareas           
         Scenario Outline: Search home By between range of Areas 
   When I search about home with "Areas" between 150 to 250 <metersquare>
  Then A list of homes that matches the  type specification should be returned and printed on the console6
   And  email with the result should be send to user "samedk2000@gmail.com"    
   Examples:
|metersquare|
|"200"|
|"300"| 
 
             
           
@Bybelowspecificarea 
       Scenario Outline: Search home by By below specific area  
   When I search about home with "area: less than 100 <metersquare> 
  Then A list of homes that matches the  type specification should be returned and printed on the console5
  And  email with the result should be send to user "samedk2000@gmail.com"    
  Examples:
|metersquare|
|"200"|
|"90"| 
   


   @bybelowspecificprice        
       Scenario Outline: Search home by below specific price 
   When I search about home with "price" less than 200 <mon>
  Then A list of homes that matches the  type specification should be returned and printed on the console3
And  email with the result should be send to user "samedk2000@gmail.com"    
Examples:
|mon|
|"6 months "|
|"12 months "| 
          
@bybetwenrangeofprices   
       Scenario Outline: Search home by By between range of prices 
   When I search about home with "price" between 100 to 400 <mon>
  Then A list of homes that matches the  type specification should be returned and printed on the console4
 And  email with the result should be send to user "samedk2000@gmail.com"    
 Examples:
|mon|
|"6 months"|
|"12 months"| 
      
                 
    
        
        
        
     @byPlacment
   Scenario Outline: Search home by Placement 
   When I search about home by Placement <plac>
  Then A list of homes that matches the  type specification should be returned and printed on the console1
  And  email with the result should be send to user "samedk2000@gmail.com"    
  Examples:
|plac|
|"city"|
|"village"| 

   
        
@byMaterial        
      Scenario Outline: Search home by  Material 
   When I search about home by Material <mater>
  Then A list of homes that matches the  type specification should be returned and printed on the console2
  And  email with the result should be send to user "samedk2000@gmail.com"    
  Examples:
|mater|
|"Stone"|
|"Brick"|           
| "Wood"|       
           
        
         
        
        
        
        
        
        
 @numberbedrooms       
  Scenario Outline: Search home by number bedrooms 
   When I search about home by number bedrooms <num>
  Then A list of homes that matches the  type specification should be returned and printed on the console7
  And  email with the result should be send to user "samedk2000@gmail.com"    
  Examples:
|num|
|"1"|
|"2"|        
|"3"|
|"4"|             
|"5"|

  

@numberBathrooms
 Scenario Outline: Search home by number bathrooms 
   When I search about home by number bathrooms <num1>
  Then A list of homes that matches the  type specification should be returned and printed on the console8
  And  email with the result should be send to user "samedk2000@gmail.com"    
  Examples:
|num1|
|"1"|
|"2"|        
|"3"|



@allowPets
 Scenario Outline: Search home by Allow Pets
When I search about home by Allow Pets <allow>
 Then A list of homes that matches the  type specification should be returned and printed on the console9
 And  email with the result should be send to user "samedk2000@gmail.com"    
 Examples:
|allow|
|"Yes"|
|"NO"|


@bytype
  Scenario Outline: Search home by type
  When I search about home by <type>
  Then A list of homes that matches the  type specification should be returned and printed on the console10
And  email with the result should be send to user "samedk2000@gmail.com"    
Examples:
|type|
|"HOUSE"|
|" Apartment"|            



@ByLeaseLength
  Scenario Outline: Search home by Lease Length
  When I search about home by Lease Length <length>
  Then A list of homes that matches the  type specification should be returned and printed on the console11
And  email with the result should be send to user "samedk2000@gmail.com"    
Examples:
|length|
|"6 "|
|"12 "|

  

@ByAmenities
Scenario Outline: Search home by Amenities
  When I search about home By Amenities <amenities>
  Then A list of homes that matches the  type specification should be returned and printed on the console12

And  email with the result should be send to user "samedk2000@gmail.com"            
Examples:
|amenities|
|" AirConditioning"|
|"Balcony "|
|"Elevator"|
|"FirePlace"|
|"Garage Parking"|
|"Swimming Pool "|
        
           
        
 @mentiontosenarios       
  Scenario Outline: Search home by type and Placement
       When I search about home By type of <x>
       And I search about home By Placement of <y> 
  Then A list of homes that matches the  type specification should be returned and printed on the console13
    
And  email with the result should be send to user "samedk2000@gmail.com"            
            
 Examples:
 |   x   |   y   |       
 |"HOUSE"|"city"|     
 |" Apartment"| "village"|
        
        
        
        
                      