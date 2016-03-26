class Solution {
    int solution(int[] A, int X) {
	        int N = A.length;
			        if (N == 0) {
					            return -1;
								        }
										        int l = 0;
												        int r = N - 1;
														        while (l < r) {
																            int m = (l + r) / 2;
																			            if (A[m] > X) {
																						                r = m - 1;
																										            } else {
																													                l = m;
																																	            }
																																				        }
																																						        if (A[l] == X) {
																																								            return l;
																																											        }
																																													        return -1;
																																															    }
																																																    
																																																	    
																																																		    public static void main(String args[])
																																																			    {
																																																				    	Solution s=new Solution();
																																																						    	int[] array={1,3,5,2,9};
																																																								    	
																																																										    	int index= s.solution(array,5);
																																																												    	System.out.println(index);
																																																														    }
																																																															}
