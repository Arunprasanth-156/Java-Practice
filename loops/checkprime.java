package loops;

public class checkprime {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("enter integer");
			return;
		}
			
			int num =Integer.parseInt(args[0]);
		if(num<2) {
			System.out.println(num+"neither prime nor composite");
			return;
		}
		boolean isprime=true;
		for(int i =2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
			isprime =false;
				break;
			}
		
			
			
		}if(isprime) {
			System.out.println(num+" "+"is prime");
		}else {
			System.out.println(num+" "+"it is not prime");
		}
		

	}
}



