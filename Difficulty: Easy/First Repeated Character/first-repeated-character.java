class Solution {
    String firstRepChar(String s) {
        // code here
        s=s.toLowerCase();
        Map<Character,Integer>ans=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ans.containsKey(ch)){
                return String.valueOf(ch);
            }
            ans.put(ch,i);
        }
        return "-1";
        
    }
}