package Ifelse;
import java.util.Scanner;


public class Alphabetdisplay {

	public static void main(String[] args) {
		System.out.println("Enter input");
		Scanner sc = new Scanner(System.in);
		char A = sc.next().charAt(0);
		char B = sc.next().charAt(0);
		
		if((A>='a'&& A<='z')||(A>='A'&& A<='Z')){
			System.out.println("Alphabet");
			
		}else if(A>='0'&& A<='9') {
			System.out.println("Integer");
		}else {
			System.out.println("Special character");
		}
		if((B>='a'&&B<='z')||(B>='A'&& B<='Z')){
			System.out.println("Alpahbet");
		}else if(B>='0'&&B<='9') {
			System.out.println("Integer");
		}else {
			System.out.println("Special character");
		}sc.close();
		
		
		

	}

}
