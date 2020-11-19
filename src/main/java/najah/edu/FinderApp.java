package najah.edu;


import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;


public class FinderApp {



 List <HOME>homes =new ArrayList<HOME>();
private WebEmailServece emails;
public static List<HOME>priceList;
public static List<HOME>placementList;
public static List<HOME>materialList;
public static List<HOME>typeList;
public static List<HOME>nobedroomsList;
public static List<HOME>nobathdroomsList;
public static List<HOME>leaselengthList;
public static List<HOME>petsList;
public static List<HOME>amenitiesList;
public static List<HOME>areaList;

	
public FinderApp() {
	super();
}

public void setEmail(WebEmailServece e) {
	this.emails=e;
}
public FinderApp(List<HOME> homes) {
	super();
	this.homes = homes;
}


	
	public List<HOME> homeByplacment(String placment) {

    	List<HOME> foundplacment =new ArrayList<HOME>();
    	
    	
    	ListIterator<HOME> home= homes.listIterator();

     	while(home.hasNext()) {
        	
    		HOME hom=home.next();
    		if(hom.getPlacment().equalsIgnoreCase(placment))
    			foundplacment.add(hom);
    		
    	}
     	placementList=foundplacment;
     	emails.sendEmail("samedk2000@gmail.com", foundplacment);
     	

    	return foundplacment;
    }
    //////////
    
	
    public List<HOME> homeBymatrial(String matrial) {
    	List<HOME> foundmatrial =new ArrayList<HOME>();
     	Iterator<HOME> home=homes.iterator();
     	while(home.hasNext()) {
    		HOME hom=home.next();
    		if(hom.getPlacment().equalsIgnoreCase(matrial))
    			foundmatrial.add(hom);
    		
    	}
     	materialList=foundmatrial;
     	emails.sendEmail("samedk2000@gmail.com", foundmatrial);
     	
    	return foundmatrial;
    }
    
    ////////////
    public List<HOME> homeByprice(int price) {
    	List<HOME> foundprice =new ArrayList<HOME>();
    	Iterator<HOME> home=homes.iterator();
    	while(home.hasNext()) {
    		HOME hom=home.next();
    		if(hom.getPrice() < price)
    			foundprice.add(hom);
    		else if(hom.getPrice() > price && hom.getPrice() < price) {
    			foundprice.add(hom);
    		}
    		
    	}
    	priceList=foundprice;
     	emails.sendEmail("samedk2000@gmail.com", foundprice);
    	
    	
	
        return foundprice;
    }
    
    
    ///////////
    public List<HOME> homeBytype(String type) {
       List<HOME> foundtype =new ArrayList<HOME>();
    	Iterator<HOME> home=homes.iterator();
    	while(home.hasNext()) {
    		HOME hom=home.next();
    		if(hom.getType().equalsIgnoreCase(type))
    			foundtype.add(hom);
    	}
	
    	typeList=foundtype;
     	emails.sendEmail("samedk2000@gmail.com", foundtype);
     	
        return foundtype;
    }
    
    
	//////////
    
    
    
    
    public List<HOME> homeBynobedrooms(int nobedrooms) {
		
    	
    	
    	
    	List<HOME> foundnobedrooms =new ArrayList<HOME>();
    	Iterator<HOME> home=homes.iterator();
    	while(home.hasNext()) {
    		HOME hom=home.next();
    		if(hom.getNoofdebrooms()==nobedrooms  )
    			foundnobedrooms.add(hom);
   
    		
    	}
    	nobedroomsList=foundnobedrooms;
     	emails.sendEmail("samedk2000@gmail.com", foundnobedrooms);
	
        return foundnobedrooms;
       
    	
    }
    
    
   
    
    ////////////

    public List<HOME> homeBynobathdrooms(int nobathrooms) {

    	List<HOME> foundnobathrooms =new ArrayList<HOME>();
    	Iterator<HOME> home=homes.iterator();
    	while(home.hasNext()) {
    		HOME hom=home.next();
    		if(hom.getNoofbathrooms()==(nobathrooms))
    			foundnobathrooms.add(hom);
   
    		
    	}
    	nobathdroomsList=foundnobathrooms;
     	emails.sendEmail("samedk2000@gmail.com", foundnobathrooms);
	
        return foundnobathrooms;
       
    }
    
///////////

public List<HOME> homeByAllowPets(boolean allowPets) {
	List<HOME> foundAllowPets =new ArrayList<HOME>();
	Iterator<HOME> home=homes.iterator();
	while(home.hasNext()) {
		HOME hom=home.next();
		if(hom.isPets()== allowPets )
			foundAllowPets.add(hom);
	}
	petsList=foundAllowPets;
 	emails.sendEmail("samedk2000@gmail.com", foundAllowPets);

    return foundAllowPets;
}
    
    
    

///////////
public List<HOME> homeByLeaseLength (int leaseLength) {
	List<HOME> foundLeaseLength =new ArrayList<HOME>();
	Iterator<HOME> home=homes.iterator();
	while(home.hasNext()) {
		HOME hom=home.next();
		if(hom.getLeaselength()==leaseLength)
			foundLeaseLength.add(hom);
	}
	leaselengthList=foundLeaseLength;
 	emails.sendEmail("samedk2000@gmail.com", foundLeaseLength);

    return foundLeaseLength;
}
    
    


//////////////
public List<HOME> homeBynAmenities(String[] amenities) {
	List<HOME> foundAmenities =new ArrayList<HOME>();
	Iterator<HOME> home=homes.iterator();
	while(home.hasNext()) {
		HOME hom=home.next();
		if(hom.getAmenities().equals(amenities))
			foundAmenities.add(hom);
	}
	amenitiesList=foundAmenities;
 	emails.sendEmail("samedk2000@gmail.com", foundAmenities);

    return foundAmenities;
}






    
    
    //////////
    public List<HOME> homeByarea(int area) {
   
    	List<HOME> foundarea =new ArrayList<HOME>();
    	Iterator<HOME> home=homes.iterator();
    	while(home.hasNext()) {
    		HOME hom=home.next();
    		if(hom.getArea() < area)
    			foundarea.add(hom);
    		else if(hom.getArea() > area && hom.getArea() < area) {
    			foundarea.add(hom);
    		}
    		
    	}
    	areaList=foundarea;
     	emails.sendEmail("samedk2000@gmail.com", foundarea);
	
        return foundarea;
    	
    	
    	
    	
    	
    }
    
    

    
    
}