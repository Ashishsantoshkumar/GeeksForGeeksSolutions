class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // write code
        Map<Integer,Integer>ans=new HashMap<>();
        
        for(int n:arr){
           
            ans.put(n,ans.getOrDefault(n,0)+1);
            
            if(ans.get(n)>=k){
                return n;
            }
        }
        return -1;
    }
}