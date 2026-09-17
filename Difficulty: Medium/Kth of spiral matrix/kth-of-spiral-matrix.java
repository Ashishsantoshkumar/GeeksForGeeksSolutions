class Solution {
	public int findK(int[][] mat, int k) {
		// code here
		List<Integer>ans = new ArrayList<>();
		int n = mat.length - 1;
		int m = mat[0].length - 1;
		int rowst = 0, colst = 0, rowEnd = n, colEnd = m;
		while (rowst <= rowEnd && colst <= colEnd) {
			
			for (int i = colst; i <= colEnd; i++) {
				ans.add(mat[rowst][i]);
			}
			rowst++;
			for (int i = rowst; i <= rowEnd; i++) {
				ans.add(mat[i][colEnd]);
			}
			colEnd--;
			if (rowst <= rowEnd) {
				
				for (int i = colEnd; i >=colst; i--) {
					ans.add(mat[rowEnd][i]);
				}
				rowEnd--;
			}
			if (colst <= colEnd) {
				
				for (int i = rowEnd; i>=rowst; i--) {
					ans.add(mat[i][colst]);
				}
				colst++;
			}
		}
		
		return ans.get(k - 1);
		
	}
}
