import java.util.*;
import java.util.Scanner;

class Oddeven{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int ip = keyboard.nextInt();
		
		if(ip>0){
			if(ip%2 == 0)
			{
				System.out.println(ip+" is even!");
			}
			else
			{
				System.out.println(ip+" is odd!");
			}
		}
		else
		{
			System.out.println("0 is not odd or even");
		}
	}
}
