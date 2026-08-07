class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        
        Map<Character,Integer>ans=new HashMap<>();
        for(char ch:s.toCharArray()){
            ans.put(ch,ans.getOrDefault(ch,0)+1);
            
        }
        List<Character> list=new ArrayList<>(ans.keySet());
        Collections.sort(list);
        int max=-1;
        char c='\0';
        for(char ch:list){
            if(ans.get(ch)>max){
                max=ans.get(ch);
                c=ch;
            }
            
        }
        return c;
    }
    
}