class Solution {
    public int firstRepeated(int[] arr) {
        // code here
        
        Map<Integer,Integer>ans=new HashMap<>();
        
        for(int n:arr){
            ans.put(n,ans.getOrDefault(n,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(ans.get(arr[i])>1){
                return i+1;
            }
        }
        return -1;
        
    }
}
