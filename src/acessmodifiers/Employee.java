package acessmodifiers;

//public,  private, default, protected

public class Employee {
	public void printName() {
		System.out.println("Chetan");
		printSalary();
		
	}
	private void printSalary() {
		System.out.println("234234");
	}

}
