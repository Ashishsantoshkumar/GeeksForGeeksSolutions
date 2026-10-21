class Solution {
    public int countOccurence(int[] arr, int k) {
        // code here
        Map<Integer,Integer>ans=new HashMap<>();
        int count=0;
        for(int n:arr){
            ans.put(n,ans.getOrDefault(n,0)+1);
        }
        int y=arr.length;
        for(int x:ans.keySet()){
            int freq=ans.get(x);
            if(freq>y/k){
                count++;
            }
        }
        return count;
    }
}