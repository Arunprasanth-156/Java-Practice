package problemsdaily;
import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		         System.out.println("ENTER INPUT STRING");

		       Scanner sc = new Scanner(System.in);
		       String A= sc.nextLine();
		       String B= sc.nextLine();

		  if(A.isEmpty()||B.isEmpty()){
		       System.out.println("not given");
		 }

		  else{
		     System.out.println(A+" "+"technologies"+" "+B);   
			}
		}
	}


