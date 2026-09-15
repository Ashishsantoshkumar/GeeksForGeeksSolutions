class Solution {
    public boolean isFrequencyUnique(List<Integer> arr) {
        // code here
        Map<Integer,Integer>ans=new HashMap<>();
        Set<Integer>set=new HashSet<>();
        
        for(int n:arr){
            ans.put(n,ans.getOrDefault(n,0)+1);
        }
        for(int x:ans.values()){
            if(!set.contains(x)){
                set.add(x);
            }
            else{
                return false;
            }
        }
        return true;
    }
}