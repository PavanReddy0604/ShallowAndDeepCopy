package com.deepcopy;

public class Main {
	
	public static void main(String[] args)throws CloneNotSupportedException {
		Address address1=new Address(1, "kadapa", 516474);
		Employee emp1= new Employee(1, "ramu", 7500, address1);
		System.out.println("emp1 hashcode "+emp1.getAddress().hashCode());
		System.out.println("employee1 "+emp1);
		Employee emp2=(Employee) emp1.clone();
		emp2.getAddress().setCity("kurnool");
		System.out.println("emp2 hashcode "+emp2.getAddress().hashCode());
		System.out.println("employee2 "+emp2);
		System.out.println("after cloning ");
		System.out.println("employee1 "+emp1);
		System.out.println("emp1 hashcode "+emp1.getAddress().hashCode());
	}

}
