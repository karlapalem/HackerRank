import java.util.*;

class ReverseString{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String ip = keyboard.nextLine();
		char[] ipChar = ip.toCharArray();
		ReverseString rs = new ReverseString();
		String reversed = new String(rs.reverseString(ipChar));
		System.out.println("Reverse String is: "+ reversed);
	}

	public static char[] reverseString(char[] ip){
		int i = 0;
		int j = ip.length -1;
		char temp;
		
		if(ip.length != 0)
		{
			while(i != j && i<= ip.length/2)
			{
				temp = ip[i];
				ip[i] = ip[j];
				ip[j] = temp;
				++i;
				--j;	
			}

			return (ip);
		}
		else{ return ip;}
	} 

}
