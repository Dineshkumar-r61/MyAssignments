package week1.homeassignments;

public class Palindromeisanumber {

	public static void main(String[] args) {
		
		int number = 121;
		int orginalNumber = number;
		int reverse =0;

		for (int temp = number;temp!=0;temp=temp/10) {
			reverse = reverse*10 + temp%10;
			System.out.println(reverse);
			
		}
		if (reverse == orginalNumber) {
			System.out.println(orginalNumber+ " is a palindrome");
		}
		else {
			System.out.println(orginalNumber+ " is not a palindrome");
		}
	}

}



//rev = rev*10 + temp%10;
//temp = temp/10 = 12