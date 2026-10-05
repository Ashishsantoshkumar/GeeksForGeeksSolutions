class Solution {
	boolean isPrime(int n) {
		
		if (n<2)
			return false;
		for (int i = 2; i*i <= n; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	public ArrayList<Integer> superPrimes(int n) {
		// code here
		ArrayList<Integer>an = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) {
				an.add(i);
			}
		}
		ArrayList<Integer>ans = new ArrayList<>();
		for (int i = 0; i<an.size(); i++) {
			if (isPrime(i+1)) {
				ans.add(an.get(i));
			}
			
		}
		return ans;
		
	}
}
