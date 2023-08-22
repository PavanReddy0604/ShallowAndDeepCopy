package com.copyforprimitivefilelds;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(1,"kavan", 6400);
		System.out.println("emp1 "+emp1);
		Employee emp2=(Employee) emp1.clone();
		System.out.println("emp2 "+emp2);
		emp2.setName("pavan");
		System.out.println("emp2 "+emp2);
		System.out.println("emp1 "+emp1);

	}

}
