package com.cts.project1.pages;
public class Employee2 {		
	public static void main(String[] args) {
		//instance methods
		Employee2 object1=new Employee2();
		Employee2 object2=new Employee2("Chetan",40,"pune",123224);
		object2.printEmployeeDetails();		
	}

	public Employee2() {
		System.out.println("no arguments");
	}

	public Employee2(String name, int age, String city, long salary) {
		super();
		this.name = name;
		this.age = age;
		City = city;
		this.salary = salary;
		System.out.println("i am in constructor 2");
	}


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



}
