class Solution {
	public ArrayList<Integer> minAnd2ndMin(int[] arr) {
		// code here
		Set<Integer> num = new HashSet<>();
		ArrayList<Integer> ans = new ArrayList<>();
		
		for (int n:arr) {
			num.add(n);
		}
		
		int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
		for (int m:num) {
			if (m<first) {
				second = first;
				first = m;
			}
			else if (m>first && m<second) {
				second = m;
			}
		}
		if (second == Integer.MAX_VALUE) {
			ans.add(-1);
			return ans;
		}
		
		ans.add(first);
		ans.add(second);
		
		return ans;
	}
}
