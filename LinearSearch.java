import java.util.*;

class LinearSearch{
	public static void main(String[] args){
		int[] a = {2,3,4,5,6,7,3,2,89,54,23,1,45};
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the value to be searched in array: ");
		int val = kb.nextInt();
		linearSearch(a, val);
	}

	static void linearSearch(int[] a, int val){
		String indexes = "";
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == val)
			{
				indexes = indexes + i + " ";
			}
		}
		
		if(indexes == "")
		{
			indexes = "none";
		}

		System.out.println("The value "+val+" is present in: "+indexes);
	}
}
