package week1.homeassignments;

public class CheckNumberIsPrime {

	public static void main(String[] args) {
		
		int number=13;
		boolean isPrime=true; //flag
		
		if (number <= 1) {
			isPrime=false;
	    }
		else {
		for (int i = 2; i <= number/2 ; i++) {
				
			if (number%i==0) {
			isPrime=false;
			}
			else {
				isPrime = true;
			}
	     }    
			
		if (isPrime) {
			System.out.println(number+" " +"is a Prime number");
			}
		else {
			System.out.println(number+" " +"is not a Prime number");
		    }
		}
	}
}