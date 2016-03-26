import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class FizzBuzz{
	public static void main(String[] args) throws IOException{
	//get file path
	String filepath = "/home/poojitha/Desktop/Internship/Interview/ip.txt";
	//open buffered reader
	BufferedReader br = new BufferedReader(new FileReader(filepath));
	String line = br.readLine();
	while(line != null)
	{
		Scanner ip = new Scanner(line);
		//System.out.println(ip.nextInt());
		//System.out.println(ip.nextInt());
		//System.out.println(ip.nextInt());

		int fizz = ip.nextInt();
		int buzz = ip.nextInt();
		int number = ip.nextInt();

		for(int n=1; n<=number; n++){
		if(n%fizz != 0 && n%buzz != 0){
			System.out.print(n);
			System.out.print(' ');
		}
		else if(n%fizz == 0 && n%buzz == 0){
			System.out.print("FB");
			System.out.print(' ');
		}
		else if(n%fizz == 0){
			System.out.print("F");
			System.out.print(' ');
		}
		else{
			System.out.print("B");
			System.out.print(' ');
		}
		}

		System.out.println();

		line = br.readLine();
	}
}
}

/*
	// close buffered reader
	br.close();



		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int ip = keyboard.nextInt();

		if(ip%3 != 0 && ip%5 !=0)
		{
			System.out.println(ip);
		}
		else if(ip%3==0 && ip%5==0)
		{
			System.out.println("Fizzbuzz!");
		}
		else
		{
			if(ip%3 == 0)
			{
				System.out.println("Fizz!");
			}
			else
			{
				System.out.println("Buzz!");
			}
		}
	}
}*/
