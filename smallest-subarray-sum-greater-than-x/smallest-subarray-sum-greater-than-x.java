class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // code here
        int sum=0;
         int left=0;
         int minNo=Integer.MAX_VALUE;
         for(int i=0;i<arr.length;i++){
             sum+=arr[i];
             while(sum>x){
                 minNo=Math.min(minNo,i-left+1);
                 sum-=arr[left];
                 left++;
             }
             
             
         }
         return minNo==Integer.MAX_VALUE?0:minNo;
         
         
        
         
    }
}
