class Solution {
    public boolean ternarySearch(int[] arr, int x) {
        // code here
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }
}