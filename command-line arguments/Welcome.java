package problemsdaily;
import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		System.out.println("Enter your input");
		Scanner sc =new Scanner(System.in);
		String A = sc.nextLine();
		if(A.isEmpty()){
		System.out.println("invalid");
		}
		else{
		System.out.println("Welcome"+" "+A);
		}
		}
	}


