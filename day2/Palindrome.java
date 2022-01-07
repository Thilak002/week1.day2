package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num =34343;
		int sum=0,rem;
		int orgnum =num;
		while(num > 0){
			   rem = num % 10;
			   sum = (sum*10)+rem;
			   num = num/10;
		
			if(orgnum == sum) {
				System.out.println("palindrome number");
			}
			else {
				System.out.println("not palindrome number");
			}
		}

	}

}
