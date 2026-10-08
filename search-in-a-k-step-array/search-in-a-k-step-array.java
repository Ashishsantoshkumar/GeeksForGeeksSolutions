class Solution {
	public int findStepKeyIndex(int[] arr, int k, int x) {
		// code here
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
			
			if (i > 0 && Math.abs(arr[i] - arr[i - 1]) <= k) {
				if (arr[i - 1] == x) {
					return i - 1;
				}
			}
		}
		return - 1;
	}
}
