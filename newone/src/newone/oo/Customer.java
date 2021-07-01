package newone.oo;

public class Customer {
	private int userID;
    private String emailId;
    private String password;
    private String firstName;
    private String lastName;
    private String city;
    private String gender;
    private long phoneNumber;
    public Customer(int i, String string, String string2, String string3, String string4, String string5, String string6, long l, Address address){}
    public Customer(int userID,String emailId,String password,String firstName,String lastName,String city,String gender,long ph){
        this.userID=userID;
        this.emailId=emailId;
        this.password=password;
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.phoneNumber=ph;
        this.city=city;
    }
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void print()
	{
		System.out.println("Empid"+userID+"Name"+emailId);
	}
	@Override
	public String toString() {
		return "Customer [userID=" + userID + ", emailId=" + emailId + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", city=" + city + ", gender=" + gender + ", phoneNumber="
				+ phoneNumber + "]";
	}
	

}
