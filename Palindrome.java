import java.util.*;

class Palindrome{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = keyboard.nextInt();
		Palindrome p = new Palindrome();
		int revnum = p.reverse(num);
		if(revnum == num)
		{
			System.out.println(num+" is a Palindrome!");
		}
		else
		{
			System.out.println(num+" is not a Palindrome");
		}
	}

	public static int reverse(int num){
		int reverse = 0;
		
		while(num!= 0)
		{
			reverse = reverse * 10;
			reverse = reverse+ num%10;
			num = num/10;
		}
		return reverse;
		
	}
}
