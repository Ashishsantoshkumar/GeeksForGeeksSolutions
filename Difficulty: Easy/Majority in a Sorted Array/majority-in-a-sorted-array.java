class Solution {
    public boolean isMajority(int[] arr) {
        // code here
        int n=arr.length;
        Map<Integer,Integer>ans=new HashMap<>();
        for(int m:arr){
            ans.put(m,ans.getOrDefault(m,0)+1);
        }
        for(int x:arr){
            if(ans.get(x)>(n/2)){
                return true;
            }
        }
        return false;
    }
}