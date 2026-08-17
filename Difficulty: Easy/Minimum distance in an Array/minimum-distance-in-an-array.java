class Solution {
	int minDist(int arr[], int x, int y) {
		// code here
		int minNo = Integer.MAX_VALUE;
		for (int i = 0; i<arr.length; i++) {
	
			if (arr[i] == x) {
			    
				for (int j = 0; j<arr.length; j++) {
					if (arr[j] == y) {
						minNo=Math.min(minNo,Math.abs(j-i));
					}
					
				}
				
			}
			
			
		}
		if(minNo==Integer.MAX_VALUE) return -1;
		return minNo;
		
	}
	
}
