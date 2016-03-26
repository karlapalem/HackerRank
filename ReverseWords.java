import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReverseWords{
	public static void main(String[] args) throws IOException{
		
		String filepath = "/home/poojitha/Desktop/Internship/Interview/ip.txt";
		BufferedReader br = new BufferedReader(new FileReader(filepath));

		String line = br.readLine();

		while(line != null){
			String[] words = line.split(" ");

			for(int i=(words.length -1); i>0; i--)
			{
				System.out.print(words[i]);
				System.out.print(" ");
			}
			System.out.print(words[0]);

			line = br.readLine();
			System.out.println();
		}

		br.close();
	}
}
