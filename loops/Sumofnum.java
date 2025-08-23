package loops;

public class Sumofnum {
	

	    public static void main(String[] args) {
	        if (args.length == 0) {
	            System.out.println("Enter an integer");
	            return;
	        }

	        int num = Integer.parseInt(args[0]);
	        int sum = 0;

	        
	        num = Math.abs(num);

	        while (num > 0) {
	            sum += num % 10; 
	            num /= 10;       
	        }

	        System.out.println("Sum of digits = " + sum);
	    }
	}


		
	
