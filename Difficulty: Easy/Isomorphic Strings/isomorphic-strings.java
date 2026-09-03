class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        
        Map<Character,Integer> ans=new HashMap<>();
        Map<Character,Integer> num=new HashMap<>();
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            
            if(!ans.containsKey(s1.charAt(i))){
                ans.put(s1.charAt(i),i);
            }
            if(!num.containsKey(s2.charAt(i))){
                num.put(s2.charAt(i),i);
            }
            if(!ans.get(s1.charAt(i)).equals(num.get(s2.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}