package Whileloop;

public class Palindrome {

	public static void main(String[] args) {
		if(args.length==0) {
		System.out.println("Enter input");
		return;
		}
		int num =Integer.parseInt(args[0]);
		int original=num;
		int reversed =0;
		while(num!=0) {
			int digit = num%10;
			reversed = reversed*10+digit;
			num = num/10;
		}
		if(original==reversed) {
			System.out.println(original+" "+"is palindrome");
		}else {
			System.out.println(original+" "+"is not palindrome");
		}
		
		
	

	}

}
