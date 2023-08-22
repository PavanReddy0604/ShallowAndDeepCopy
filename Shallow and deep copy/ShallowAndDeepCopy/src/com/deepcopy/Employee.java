package com.deepcopy;

public class Employee implements Cloneable{
	
	
	
	private int eId;
	private String eName;
	private long salary;
	private Address address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eId, String eName, long salary, Address address) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
		this.address = address;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee emp=(Employee) super.clone();
		emp.address=(Address) address.clone();
		return emp;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
	

}
