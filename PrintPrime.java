import java.util.*;

class PrintPrime{
	public static void main(String[] args){
		int i = 0;

		while(i < 100)
		{
			boolean isprime = true;
			for(int j = 2; j<i; ++j)
			{
				if(i%j ==0)
				{
					isprime = false;
				}
			}

			if(isprime == true)
			{
				System.out.println(i);
			}
			++i;
		}
	}
}
