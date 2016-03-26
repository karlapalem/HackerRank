import java.util.*;

class Pyramid{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of levels of pyramid: ");
		int levels = keyboard.nextInt();
		int i = 0;

		while(i<levels)
		{
			int j = 0;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
