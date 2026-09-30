class Solution {
	public ArrayList<Integer> topKFreq(int[] arr, int k) {
		// Code here
		
		Map<Integer, Integer> ans = new HashMap<>();
		for (int n:arr) {
			ans.put(n, ans.getOrDefault(n, 0) + 1);
		}
		ArrayList<Map.Entry<Integer, Integer>> num = new ArrayList<>(ans.entrySet());
		Collections.sort(num, (a, b)->{
		
		if(b.getValue() != a.getValue()) {
			return b.getValue() - a.getValue();
		}
		return b.getKey() - a.getKey();
		});
		
		ArrayList<Integer> x = new ArrayList<>();
		
		for (Map.Entry<Integer, Integer> e:num) {
			if (k == 0)
				break;
			x.add(e.getKey());
			k--;
			
		}
		return x;
	}
}
