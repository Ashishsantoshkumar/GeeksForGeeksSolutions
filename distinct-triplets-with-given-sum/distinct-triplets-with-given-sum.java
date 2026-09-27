class Solution {
	public ArrayList<ArrayList<Integer>> threeSum(int[] arr, int target) {
		// code here
		Set<ArrayList<Integer>> ans = new HashSet<>();
		Arrays.sort(arr);
		for (int i = 0; i<arr.length; i++) {
			int st = i + 1, end = arr.length - 1;
			while (st<end) {
			    int sum=arr[i]+arr[st]+arr[end];
				if (sum == target) {
					ArrayList<Integer> num = new ArrayList<>();
					num.add(arr[i]);
					num.add(arr[st]);
					num.add(arr[end]);
					ans.add(num);
					st++;
					end--;
					
				}
				else if(sum<target){
				    st++;
				}
				else{
				    end--;
				}
				
			}
		}
		return new ArrayList<>(ans);
		
	}
}
