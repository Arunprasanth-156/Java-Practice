package Ifelse;
import java.util.Scanner;

public class Alphabetorder {

	public static void main(String[] args) {
		System.out.println("Enter input");
		Scanner sc = new Scanner(System.in);
		char A =sc.next().charAt(0);
		char B =sc.next().charAt(0);
		
		if(B>A) {
			System.out.println(B+" "+A);
		}else{
			System.out.println(A+" "+B);
		}sc.close();
		
		
		
		

	}

}
