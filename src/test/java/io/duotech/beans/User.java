package io.duotech.beans;

public class User {
	// beans, pojo(plain old java object), model >>> simple java class that represents the custom object that
    // I am going to use in my DataTable argument    

	private String firstName;
	private String lastName;
	private String address;
	private String password;
	private String city;
	private String zip;
	private String phone;
	
	
	
	public User(String firstName, String lastName, String address, String password, String city, String zip,
			String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.password = password;
		this.city = city;
		this.zip = zip;
		this.phone = phone;
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



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getZip() {
		return zip;
	}



	public void setZip(String zip) {
		this.zip = zip;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
	

}
