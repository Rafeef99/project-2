package najah.edu;

public class HOME {
	private  int id;

	private int  price;
	private int  area;
	private  int noofdebrooms;
	private int noofbathrooms;
	private int leaselength;
	    
	
	
	
	
	
	private String type;
	private String[]  amenities;
	private boolean  pets;
	private String  matrial;
	private String  placment;

	public HOME(int id, int price, int area, int noofdebrooms, int noofbathrooms, int leaselength, String type,
			String[] amenities, boolean pets, String matrial, String placment) {
		super();
		this.id = id;
		this.price = price;
		this.area = area;
		this.noofdebrooms = noofdebrooms;
		this.noofbathrooms = noofbathrooms;
		this.leaselength = leaselength;
		this.type = type;
		this.amenities = amenities;
		this.pets = pets;
		this.matrial = matrial;
		this.placment = placment;
	}


	@Override
	public String toString() {
		return "HOME [id=" + id + ", price=" + price + ", area=" + area + ", no_of_debrooms=" + noofdebrooms
				+ ", no_of_bathrooms=" + noofbathrooms + ", lease_length=" + leaselength + ", type=" + type
				+ ", Amenities=" + amenities + ", Pets=" + pets + ", matrial=" + matrial + ", placment=" + placment
				+ "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	public int getNoofdebrooms() {
		return noofdebrooms;
	}


	public void setNoofdebrooms(int noofdebrooms) {
		this.noofdebrooms = noofdebrooms;
	}


	public int getNoofbathrooms() {
		return noofbathrooms;
	}


	public boolean isPets() {
		return pets;
	}


	public void setPets(boolean pets) {
		this.pets = pets;
	}


	public void setNoofbathrooms(int noofbathrooms) {
		this.noofbathrooms = noofbathrooms;
	}


	public int getLeaselength() {
		return leaselength;
	}


	public void setLeaselength(int leaselength) {
		this.leaselength = leaselength;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}







	public String getMatrial() {
		return matrial;
	}


	public void setMatrial(String matrial) {
		this.matrial = matrial;
	}


	public String getPlacment() {
		return placment;
	}


	public void setPlacment(String placment) {
		this.placment = placment;
	}




	public String[] getAmenities() {
		return amenities;
	}


	public void setAmenities(String[] amenities) {
		this.amenities = amenities;
	}










}
