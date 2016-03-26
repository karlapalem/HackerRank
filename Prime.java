import java.util.*;

public class Prime{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = keyboard.nextInt();
		Prime result = new Prime();
		boolean res = result.checkPrime(num);
		System.out.println(res);
	}

	static boolean checkPrime(int num){

		boolean result = true;
		if(num > 2){
			
			for(int i =2; i<num; ++i){
				if(num%i == 0)
				{
					result = false;
				}
			}

			return result;
		}

		else
		{
			return result;
		}
	}
}

