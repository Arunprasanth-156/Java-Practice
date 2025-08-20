package Ifelse;

public class Genderprblm {

	public static void main(String[] args) {
		
	        if (args.length < 2) {
	            System.out.println("Usage: java InterestCalculator <Gender> <Age>");
	            return;
	        }

	        String gender = args[0];
	        int age = Integer.parseInt(args[1]);

	        double interestRate = 0.0;

	        if (gender.equalsIgnoreCase("Female")) {
	            if (age >= 1 && age <= 58) {
	                interestRate = 8.2;
	            } else if (age >= 59 && age <= 100) {
	                interestRate = 9.2;
	            }
	        } else if (gender.equalsIgnoreCase("Male")) {
	            if (age >= 1 && age <= 58) {
	                interestRate = 8.4;
	            } else if (age >= 59 && age <= 100) {
	                interestRate = 10.5;
	            }
	        }

	        if (interestRate > 0) {
	            System.out.println("Percentage of interest: " + interestRate + "%");
	        } else {
	            System.out.println("Invalid input. Please check gender and age.");
	        }
	    }
	}

