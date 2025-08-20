package Ifelse;
import java.util.Scanner;

public class ACount {

	public static void main(String[] args) {
		System.out.println("enter values");
		Scanner sc = new Scanner(System.in);
		String AR =sc.nextLine();
		
		
		int A_count=0;
		int B_count=0;
		int C_count=0;
		
		for(int i=0;i<AR.length();i++) {
			if((AR.charAt(i)>='a'&&AR.charAt(i)<='z')||(AR.charAt(i)>='A'&& AR.charAt(i)<='Z')) {
				A_count++;
				
			}else if(AR.charAt(i)>='0'&&AR.charAt(i)<='9') {
				B_count++;
				
				
			}else {
				C_count++;
				
			}
			
		}
		System.out.println("Alpahbet"+" "+A_count);
		System.out.println("Integers"+" "+B_count);
		System.out.println("Spl char"+" "+C_count);
		
		
		
		sc.close();
		

	}

}
