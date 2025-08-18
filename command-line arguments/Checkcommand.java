package problemsdaily;
public class Checkcommand {
	

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("No values");
		}else {
			
			for(int a=0;a<args.length;a++) {
				System.out.println(args[a]);
				if(a < args.length<-1) {
					System.out.println(",");
				}
			}
		}
	}
}

		
		
	
