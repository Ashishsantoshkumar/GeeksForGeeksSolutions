class Solution {
	String uncommonChars(String s1, String s2) {
		// code here
		Map<Character, Integer> ans = new HashMap<>();
		Map<Character, Integer> ans2 = new HashMap<>();
		
		for (char ch : s1.toCharArray()) {
			ans.put(ch, ans.getOrDefault(ch, 0) + 1);
		}
		
		for (char ch : s2.toCharArray()) {
			ans2.put(ch, ans2.getOrDefault(ch, 0) + 1);
		}
		
		StringBuilder sb = new StringBuilder();
		Set<Character> set=new TreeSet<>();
		for (char ch:s2.toCharArray()) {
			if (!ans.containsKey(ch)) {
				set.add(ch);
			}
		}
		for (char ch:s1.toCharArray()) {
			if (!ans2.containsKey(ch)) {
				set.add(ch);
			}
		}
		
		for(char ch:set){
		    sb.append(ch);
		}
		
		return sb.toString();
	}
}
