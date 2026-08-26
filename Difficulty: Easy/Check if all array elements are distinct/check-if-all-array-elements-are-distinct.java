class Solution {
    public boolean isDistinct(int[] arr) {
        // code here
        Map<Integer,Integer>ans=new HashMap<>();
        
        for(int n:arr){
            ans.put(n,ans.getOrDefault(n,0)+1);
        }
        for(int n:ans.values()){
            if(n>1){
                return false;
            }
        }
        return true;
    }
}