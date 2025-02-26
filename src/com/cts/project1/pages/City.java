package com.cts.project1.pages;

public class City {
	
	static String name="Pune";
	int pinCode;	
	
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public City(int pinCode) {
		super();
		this.pinCode = pinCode;
	}
	public City() {		
	}


	public static void main(String[] args) {
		City c1=new City();
		System.out.println(c1.hashCode());
		City c2=new City();
		System.out.println(c2.hashCode());
		
		if(c1.equals(c2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		int n1=10;
		int n2=12;
				
		
		
	}
	

}
