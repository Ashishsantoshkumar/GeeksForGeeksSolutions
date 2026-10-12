class Solution {
	public ArrayList<Integer> filterByDigits(int[] arr) {
		// code here
		Set<Integer>s = new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(3);
		
		ArrayList<Integer> ans=new ArrayList<>();
		for (int m:arr) {
			boolean valid=true;
			int n=m;
			while (n != 0) {
				int last=n%10;
				if(!s.contains(last)){
				    valid=false;
				    break;
				}
				n/=10;
			}
			 if(valid){
			     ans.add(m);
			 }
		}
		
		return ans;
	}
}
