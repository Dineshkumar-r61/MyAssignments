package week1.homeassignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number = 8;
		int a=0;
		int b=1;
		for (int i =1 ; i<=number; i++) {
			System.out.println(a);
			int temp = a+b;
			a=b;
			b=temp;
			
		}

	}

}