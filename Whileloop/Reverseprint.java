package Whileloop;
import java.util.Scanner;

public class Reverseprint {

	public static void main(String[] args) {
		System.out.println("Enter integers");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int reversed =0;
		while(num!=0) {
			int digit = num%10;
			reversed = reversed*10+digit;
			num = num/10;
			
		}sc.close();
	
		
		System.out.println("output"+reversed);

	}

}
