package Switchstatements;
import java.util.Scanner;

public class Colourswitching {

	 public static void main(String[] args) {
	        System.out.println("Enter colour");
	        Scanner sc = new Scanner(System.in);
	        char Art = sc.next().charAt(0);

	        switch (Character.toUpperCase(Art)) {
	            case 'R':
	                System.out.println("Red");
	                break;
	            case 'B':
	                System.out.println("Blue");
	                break;
	            case 'G':
	                System.out.println("Green");
	                break;
	            case 'Y':
	                System.out.println("Yellow");
	                break;
	            case 'O':
	                System.out.println("Orange");
	                break;
	            case 'W':
	                System.out.println("White");
	                break;
	            default:
	                System.out.println("Invalid colour");
	                break;
	        }

	        sc.close(); // close scanner
	    }
	}