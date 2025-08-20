package Ifelse;
import java.util.Scanner;

public class Alphabetchange {

	public static void main(String[] args) {
		System.out.println("Enter values");
		Scanner sc = new Scanner(System.in);
		char A = sc.next().charAt(0);
		char B =sc.next().charAt(0);
		if(A>='a'&&A<='z') {
			A = (char)(A-32);
			System.out.println(A);
			
		}if(B>='A'&&B<='Z') {
			B=(char)(B+32);
			System.out.println(B);
			
		}sc.close();
		
				
		

	}

}
