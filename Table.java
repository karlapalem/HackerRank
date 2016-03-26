import java.util.*;

public class Table{
	public static void main(String[] args){
		
		int[][] table = new int[12][12];

		for(int i=0; i<12; i++){
			for(int j=0; j<12; j++){
				table[i][j] = (i+1)*(j+1);
				System.out.format("%5d", table[i][j]);
			}
			System.out.println();
		}
	}
}
