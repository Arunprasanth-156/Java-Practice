package Switchstatements;
import java.util.Scanner;

public class Monthname {

	public static void main(String[] args) {
		System.out.println("enter month");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
		default:
			System.out.println("Invalid month");
		}sc.close();
		
	}

}
