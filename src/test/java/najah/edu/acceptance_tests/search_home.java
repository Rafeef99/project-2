package najah.edu.acceptance_tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.FinderApp;
import najah.edu.HOME;

public class search_home {
	
	
	public ArrayList <HOME> List =new ArrayList();

	public ArrayList <HOME> home_inf =new ArrayList();
	
	FinderApp x=new FinderApp();
	List<HOME> pal;
	List<HOME> ww;
	@Given("these homes are contained in the system")
	public void theseHomesAreContainedInTheSystem(io.cucumber.datatable.DataTable dataTable) {

		
		
		

java.util.List<java.util.List<String>>
List =dataTable.asLists();

   
for(int i=0;i< List.size() ;i++)
{
java.util.List<String> List1 =List.get(i);
String s1= List1.get(0);
String s2= List1.get(1);
String[] tokens1 =s1.split("_");
String[] tokens2 =s2.split("_");
 

HOME home= new  HOME(i, i, i, i, i, i, s2, tokens2, false, s2, s2);

home.setId(i+1);	 
home.setType(tokens1[0]);
home.setMatrial(tokens1[1]);
home.setPlacment(tokens1[2]);

if(tokens1[3].equalsIgnoreCase("yes"))
home.setPets(true);
else
home.setPets(false);

String[] x= tokens1[4].split(",");
home.setAmenities(x);
home.setPrice(Integer.parseInt(tokens2[0]));
home.setArea(Integer.parseInt(tokens2[1]));
home.setNoofbathrooms(Integer.parseInt(tokens2[3]));
home.setNoofdebrooms(Integer.parseInt(tokens2[2]));
home.setLeaselength(Integer.parseInt(tokens2[4]));


home_inf.add(home);

} 
FinderApp search=new FinderApp(home_inf);
	
	}

	
	
@When("I search about home by Placement {string}")
public void iSearchAboutHomeByPlacement(String string) {



	if(string.equalsIgnoreCase("city")) {
   pal=x.homeByplacment(string);
	}
		
	else if(string.equalsIgnoreCase("village")) {
		
		  pal=x.homeByplacment(string);
	
	}

}

@Then("A list of homes that matches the  type specification should be returned and printed on the console1")
public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole1() {

	for( HOME y : pal) {
	
	assertEquals(pal.equals("CITY"),y.getPlacment().equals("city"));

	  System.out.print(pal);
	  pal.clear();
	}
	
}




////////////


@When("I search about home by Material {string}")
public void iSearchAboutHomeByMaterial(String mate) {
	
	if(mate.equalsIgnoreCase("Stone")) {
		pal=x.homeBymatrial(mate);
	}
	else if(mate.equalsIgnoreCase("Brick")) {
		
		pal=x.homeBymatrial(mate);
	}
	else if(mate.equalsIgnoreCase("Wood")) {
		pal=x.homeBymatrial(mate);

	}
	
	
	
}
@Then("A list of homes that matches the  type specification should be returned and printed on the console2")
public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole2() {
  
	for( HOME y : pal) {
		
	assertEquals(pal.equals("STONE"),y.getMatrial().equals("stone"));


	
	  System.out.print(pal);
	
	pal.clear();
	

	}
	
}



//////////////

@When("I search about home by number bedrooms {string}")
public void iSearchAboutHomeByNumberBedrooms(int nbedroom) {

	if(nbedroom==1) {
		pal=x.homeBynobedrooms(nbedroom);
	}
	else if(nbedroom==2) {

		pal=x.homeBynobedrooms(nbedroom);
		
	}else if(nbedroom==3) {

		pal=x.homeBynobedrooms(nbedroom);

	}else if(nbedroom==4) {

		pal=x.homeBynobedrooms(nbedroom);
		
	}else if(nbedroom==5) {

		pal=x.homeBynobedrooms(nbedroom);
		
	}
	
	
	
	
	
}
@Then("A list of homes that matches the  type specification should be returned and printed on the console7")
public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole7() {
   
	
	for( HOME y : pal) {
		
		if(pal.equals("1")) {
		assertEquals(pal,y.getNoofdebrooms());

		  System.out.print(pal);
		  pal.clear();
		}
			
		}

	
	
}





//////////////



@When("I search about home by number bathrooms {string}")
public void iSearchAboutHomeByNumberBathrooms(int nbath) {
   
	if( nbath==1) {
		pal=x.homeBynobedrooms( nbath);
	}
	else if( nbath==2) {

		pal=x.homeBynobedrooms( nbath);
		
	}else if( nbath==3) {

		pal=x.homeBynobedrooms( nbath);

	}
	
	
}
@Then("A list of homes that matches the  type specification should be returned and printed on the console8")
public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole8() {

	
	for( HOME y : pal) {
		
		assertEquals(pal.equals("1"),y.getNoofbathrooms());
		 System.out.print(pal);
		 pal.clear();
	} 

		
}


///////////




@When("I search about home by Allow Pets {string}")
public void iSearchAboutHomeByAllowPets(boolean pets) {

	if(pets) 
		
	pal=x.homeByAllowPets(pets)	;
		
	else
		
	pal=x.homeByAllowPets(pets)	;
	
	
	
	
}
@Then("A list of homes that matches the  type specification should be returned and printed on the console9")
public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole9() {
  
for( HOME y : pal) {
		
		assertEquals(pal.equals("true"),y.isPets());


System.out.print(pal);
pal.clear();
		}
}


/////////////

@When("I search about home by {string}")
public void iSearchAboutHomeBy(String type) {
    
	if(type.equalsIgnoreCase("HOUSE")) {
		
		pal=x.homeBytype(type);
		
	}
	else if(type.equalsIgnoreCase("Apartment")) {
		

		pal=x.homeBytype(type);
	}
	
	
	
}
@Then("A list of homes that matches the  type specification should be returned and printed on the console10")
public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole10() {

	for( HOME y : pal) {
		
	assertEquals(pal.equals("HOUSE"),y.getType().equals("HOUSE"));

	

	  System.out.print(pal);
	  pal.clear();

	}
	
}


////////////


@When("I search about home by Lease Length {string}")
public void iSearchAboutHomeByLeaseLength(int length) {
	
	if(length == 6) {
		pal=x.homeByLeaseLength(length);
		
	}
	else if(length == 12) {
		
		pal=x.homeByLeaseLength(length);
	}
	
	
	

}
@Then("A list of homes that matches the  type specification should be returned and printed on the console11")
public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole11() {
	

	for( HOME y : pal) {
		
	assertEquals(pal.equals("6"),y.getLeaselength());

	

	  System.out.print(pal);
	  pal.clear();

	}
}



///////////////



@When("I search about home By Amenities {string}")
public void iSearchAboutHomeByAmenities(String[] amen) {
 
	if(amen[0]=="AirConditioning" )	{
		pal=x.homeBynAmenities(amen);
	}
	else if (amen[1]=="Balcony") {
		pal=x.homeBynAmenities(amen);
	}

	else if (amen[2]=="Elevator") {
		pal=x.homeBynAmenities(amen);
	}
	else if (amen[3]=="FirePlace") {
		pal=x.homeBynAmenities(amen);
	}
	else if (amen[4]=="Garage Parking") {
		pal=x.homeBynAmenities(amen);
	}
	else if (amen[5]=="Swimming Pool") {
		pal=x.homeBynAmenities(amen);
	}
	
	
	
	
	
}
@Then("A list of homes that matches the  type specification should be returned and printed on the console12")
public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole12() {
  
	
	
	

	for( HOME y : pal) {
		
	assertEquals(pal.equals("Elevator"),y.getAmenities().equals("Elevator"));


	  System.out.print(pal);
	  pal.clear();
	}
	
}



/////////////////



@When("I search about home By type of x {string}")
public void iSearchAboutHomeByTypeOfX(String type) {
	if(type.equalsIgnoreCase("HOUSE")) {
		
		ww=x.homeBytype(type);
		
	}
	else if(type.equalsIgnoreCase("Apartment")) {
		

		ww=x.homeBytype(type);
	}
	
	
	
}
@When("I search about home By Placement of y {string}")
public void iSearchAboutHomeByPlacementOfy(String plac) {
   

	if(plac.equalsIgnoreCase("city")) {
   pal=x.homeByplacment(plac);
	}
		
	else if(plac.equalsIgnoreCase("village")) {
		
		  pal=x.homeByplacment(plac);
	
	}
	
}
@Then("A list of homes that matches the  type specification should be returned and printed on the console13")
public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole13() {
  

	for( HOME y : pal) {
		for(HOME a : ww) {
			
			
	assertEquals(pal.equals("CITY")&& ww.equals("HOUSE"),y.getPlacment().equalsIgnoreCase("CITY")
			&& a.getType().equalsIgnoreCase("HOUSE"));

	  System.out.println(pal);
	  System.out.print(ww);
		
		pal.clear();
			ww.clear();
		}

	}
	
}



/////////////////
























@When("I search about home with area between {int} to {int} {string}")
public void iSearchAboutHomeWithPricesBetweenTo(Integer int1,Integer int2, Integer int3, String string) {
 
	
	if(string =="6 months" && (int2 < int1 << int3)) {
		
		pal=x.homeByprice(int1);
		
	}
	else if (string =="12 months" && (int2 < int1 << int3)) {
		
		pal=x.homeByprice(int1);
		
	}
	
	
	
	
}
@Then("A list of homes that matches the  type specification should be returned and printed on the console4")
public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole4() {
    
	

	for( HOME y : pal) {
		
	assertEquals(pal.equals("200"),y.getPrice());


	  System.out.println(pal);
	  pal.clear();
	}
	
	
}

//////////////////
////////////
@When("I search about home with area between {int} to {int} {string}")
public void iSearchAboutHomeWithAreasBetweenTo(Integer int1,Integer int2, Integer int3, String string) {


	if(string =="6 months" && (int2 < int1 << int3)) {
		
		pal=x.homeByarea(int1);
		
	}
	else if (string =="12 months" && (int2 < int1 << int3)) {
		
		pal=x.homeByarea(int1);
		
	}
	
	
	
	
	
	
	
	
}
@Then("A list of homes that matches the  type specification should be returned and printed on the console6")
public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole6() {


	for( HOME y : pal) {
		
	assertEquals(pal.equals("200"),y.getArea());


	  System.out.println(pal);
	  pal.clear();
	}
	
}








/////////////////


@When("I search about home with price less than {int} {string}")
public void iSearchAboutHomeWithPriceLessThan(Integer int1,Integer int2, String string) {
  
	if(string =="6 months" && (int1 < int2)) {
		pal=x.homeByprice(int1);
		
	}
	else if( string =="12 months" && (int1<int2)) {
		pal=x.homeByprice(int1);	
	}
	
	
	
}
@Then("A list of homes that matches the  type specification should be returned and printed on the console3")
public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole3() {
  
	
	
	for( HOME y : pal) {
		
		assertEquals(pal.equals("100"),y.getPrice());

		  System.out.println(pal);
		  pal.clear();

		}
	
	
}

//////////////


@When("I search about home with price less than {int} {string}")
public void iSearchAboutHomeWithAreaLessThan(Integer int1,Integer int2, String string) {
  
	
	
	if(string =="6 months" && (int1 < int2)) {
		pal=x.homeByarea(int1);
		
	}
	else if( string =="12 months" && (int1<int2)) {
		pal=x.homeByarea(int1);	
	}
	
	
	
	
	
}
@Then("A list of homes that matches the  type specification should be returned and printed on the console5")
public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole5() {


	for( HOME y : pal) {
		
		assertEquals(pal.equals("100"),y.getArea());

		  System.out.println(pal);
		  pal.clear();

		}
	
}





	
		
	}