package problemsdaily;
import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		System.out.println("Enter input");
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		if(A%2==0) {
			System.out.println("Even");
			
		}else {
			System.out.println("odd");
		}
		
	}

}
