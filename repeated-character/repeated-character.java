class Solution {
    char firstRep(String s) {
        // code here
        Map<Character,Integer> ans=new LinkedHashMap<>();
        for(char ch:s.toCharArray()){
            ans.put(ch,ans.getOrDefault(ch,0)+1);
        }
        List<Character>list=new ArrayList<>();
        for(char c:ans.keySet()){
            if(ans.get(c)>1){
                list.add(c);
            }
        }
        if(list.size()==0) return '#';
        return list.get(0);
    }
}