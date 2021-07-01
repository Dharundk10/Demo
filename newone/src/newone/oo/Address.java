package newone.oo;

public class Address{
	private String city;
    private String state;
    private int zip;
    private String country;
    private Customer customer=new Customer();
//    
	public Address() {
		super();
	}
public Address(String city, String state, int zip, String country) {
	super();
	this.city = city;
	this.state = state;
	this.zip = zip;
	this.country = country;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country + ", customer="
			+ customer + "]";
}

	
}