package oops;

 public class Teacher extends Person1{
	private double salary;
	private String subject;

 public Teacher(String name,String dob,double salary,String subject){
	 super(name,dob);
	 this.salary=salary;
	 this.subject=subject;
	 
 }
 public void displayTeacherInfo(){
	 super.displayInfo();
	 System.out.println("    ");
	 System.out.println("Teacher Info");
	 System.out.println("salary"+" "+salary);
	 System.out.println("subject"+" "+subject);
 }
 }
 
