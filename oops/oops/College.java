package oops;

public class College extends Student{
	String college_name="Vel Tech";
	String year="(First/Second/third/Fourth/Fifth)";
	
	public College (String college_name,String year,int studentid)
	{
		super(studentid);
		this.college_name=college_name;
		this.year=year;
	}
	public void displayCollegeInfo()
	{   super.displaystudentInfo();
	    System.out.println("College Info");
		System.out.println("college name"+" "+college_name);
		System.out.println("year studying"+" "+year);
		
}
		
	}

