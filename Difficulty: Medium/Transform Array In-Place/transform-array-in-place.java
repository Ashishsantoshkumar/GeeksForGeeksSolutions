class Solution {
    public void arrange(int[] arr) {
        // code here
        int [] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[arr[i]];
        }
       
        for(int i=0;i<ans.length;i++){
            arr[i]=ans[i];
        }
        
    }
}