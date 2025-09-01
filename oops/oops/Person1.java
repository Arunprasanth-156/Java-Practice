package oops;

public class Person1 {
	protected String name;
	protected String dob;
	
public Person1(String name,String dob) {
	this.name=name;
	this.dob=dob;
}
	public void displayInfo()
	{
	System.out.println("Person Info");
	System.out.println("Name is" +" "+this.name);
	System.out.println("Date of birth"+" "+this.dob);
}
}



