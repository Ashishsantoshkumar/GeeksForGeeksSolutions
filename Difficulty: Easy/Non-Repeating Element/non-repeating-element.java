class Solution {
    public int firstNonRepeating(int[] arr) {
        // code here
        Map<Integer,Integer>ans=new LinkedHashMap<>();
        for(int n:arr){
            ans.put(n,ans.getOrDefault(n,0)+1);
        }
        for(int m:ans.keySet()){
            if(ans.get(m)==1){
                return m;
            }
        }
        return 0;
    }
    
}
