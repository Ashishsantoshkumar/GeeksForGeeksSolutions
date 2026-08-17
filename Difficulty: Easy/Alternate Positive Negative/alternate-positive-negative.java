class Solution {
	void rearrange(ArrayList<Integer> arr) {
		// code here
		int m = arr.size();
		List<Integer>pos = new ArrayList<>();
		List<Integer>neg = new ArrayList<>();
		ArrayList<Integer>num = new ArrayList<>();
		
		for (int n:arr) {
			if (n >= 0) {
				pos.add(n);
				
			}
			else {
				neg.add(n);
			}
		}
		
		int i = 0, j = 0;
		while (i<pos.size() && j<neg.size()) {
			num.add(pos.get(i++));
			num.add(neg.get(j++));
		}
		
		while(i<pos.size()){
		    num.add(pos.get(i++));
		}
		while(j<neg.size()){
		    num.add(neg.get(j++));
		}
		arr.clear();
		arr.addAll(num);
		return ;
	}
}
