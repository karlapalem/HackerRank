import java.util.*;

class BigPermutation{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int ip = kb.nextInt();
		int[] iparr = new int[ip];
		int[] samp = new int[]{2,9,1,3};
		System.out.println(samp[1]);
		big(samp);
	}

	static void big(int[] ip){
		int temp = 0;
		for(int i=0; i<ip.length; i++){
			int min = i;
	
			for(int j=i; j<ip.length; j++){
				if(ip[i] < ip[j]){
					min = j;	
				}
			}
		
			temp = ip[i];
			ip[i] = ip[min];
			ip[min] = temp;
		}
		System.out.println(Arrays.toString(ip));
	}
}
