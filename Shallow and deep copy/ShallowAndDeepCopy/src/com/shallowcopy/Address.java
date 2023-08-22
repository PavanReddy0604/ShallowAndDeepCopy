package com.shallowcopy;

public class Address implements Cloneable {
	
	private int addressId;
	private String city;
	private long pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addressId, String city, long pincode) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.pincode = pincode;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	

}
