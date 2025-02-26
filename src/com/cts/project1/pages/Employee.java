package com.cts.project1.pages;

public class Employee {		
	
	public static void main(String[] args) {
		//how to call static variables and methods
		System.out.println("companyName-"+compayName);
		printCompanyName();
		
		//instance methods
		Employee object1=new Employee();
		object1.age=35;
		object1.name="Navjyot";
		object1.City="Pune";
		object1.printEmployeeDetails();
	}
	
	//data members
	//satic data members--satic variables, methods	
	//instance data members--instance variables, methods
	
	//static variable
	static String compayName="CTS";
	
	//instance variables	
	String name;
	int age;
	String City;
	long salary;	
	
	//Constructor 
	
	
	//methods-instance
	public void printEmployeeDetails() {
		System.out.println("Name="+name+",age-"+age+",city+"+City+",salary"+salary);
	}
	//methods-static
	public static void printCompanyName() {
		System.out.println("companyName - "+compayName);
	}
	

}
