class Digit{

public static int solution(final int n){
    
	int count = 0;

	for (int number = 1; number<=n; number++){ 
		count = count + Count(number);
	}
	return count;
}
	
public static int Count(int number){
		if(number < 10) {
			if(number == 1){
				return 1;
			}
			else{
				return 0;
			}
		} 
		
		else 
		{						        
			if(number%10 == 1) {
				return 1 + Count(number/10);} 
				
			else {	
				return Count(number/10);
				}
				
			}
}
	

	public static void main(String[] args){
		int count = solution(20);
		System.out.println(count);
	}
}
