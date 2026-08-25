class Solution {
	int minRow(int mat[][]) {
		// code here
		int ans = Integer.MAX_VALUE;
		int minNo = Integer.MAX_VALUE;
		for (int i = 0; i<mat.length; i++) {
			int count = 0;
			
			for (int j = 0; j<mat[i].length; j++) {
				if (mat[i][j] == 1) {
					count++;
					
				}
			}
			if (minNo>count) {
				minNo = count;
				ans=i+1;
			}
		
		}
		return ans;
	}
};
