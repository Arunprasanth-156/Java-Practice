package Ifelse;
import java.util.Scanner;
public class Posorneg {

	public static void main(String[] args) {
		System.out.println("Enter input");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num<0) {
			System.out.println("it is negative");
		}
		else if(num>0) {
			System.out.println("It is negative" );
		}else {
			System.out.println("It is zero");
		}
		sc.close();
		

	}
}


