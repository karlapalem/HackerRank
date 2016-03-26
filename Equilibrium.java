class Equilibrium

{

	public static void main (String[] args) throws java.lang.Exception

	{	

		int arr[] = {-7, 1, 5, 2, -4, 3, 0};

		printEquilibrium(arr);

	}

	public static void printEquilibrium(int[] arr)

	{

		int sum=0,n=arr.length;

		int[] sumLeft=new int[n];

		int[] sumRight=new int[n];

//initialize both the sum arrays with 0
		for(int i=0;i<n;i++) 
		{
			="" sumleft[i]="0;" }="" 
			for(int="" i="0;i&lt;n;i++)" 
			{="" sumright[i]="0;" }="" for(int="" i="0;i&lt;n;i++)" {="" sumleft[i]="sum;" sum="sum+arr[i];" }="" sum="0;" for(int="" i="n-1;i">=0;i--)

{

sumRight[i]=sum;

sum=sum+arr[i];

}

for(int i=0;i<n;i++) {="" if(sumleft[i]="=sumRight[i])" system.out.println(i+"="" index="" is="" at="" equilibrium");="" }="" }="" }="">
