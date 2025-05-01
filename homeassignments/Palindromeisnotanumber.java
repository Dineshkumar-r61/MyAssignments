package week1.homeassignments;

public class Palindromeisnotanumber {
		public static void main(String[] args) {
			
			int number = 12345;
			int orginalNumber = number;
			int reverse =0;
			//for(int i =0;i<=0;i++)
			for (int temp = number;temp!=0;temp=temp/10) {
				//temp=12345,
				//temp=1234,
				//temp=123,
				reverse = reverse*10 + temp%10;
				//reverse = 0*10 + 12345%10 =>5
				//reverse = 5*10+1234%10 => 50+4 -> 54
				//reverse = 54*10+123%10 => 540+3 -> 543
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
