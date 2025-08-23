package loops;


public class Betweenprime {

	public static void main(String[] args) {
		System.out.println("prime num between 10 to 99");
		for(int num=10;num<=99;num++){
			boolean isprime=true;
		
			for(int i=2;i<=num/2;i++) {
				if(num%i==0){
					isprime=false;
					break;
				}
				
			}
		
		if(isprime) {
			System.out.print(num+" ");
			

		}
		}
	}
}
		
		

	


