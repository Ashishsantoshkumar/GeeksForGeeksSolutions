class Solution {
    int upperBound(int[] arr, int target) {
        int st=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target){
                st=i;
                break;
            }
        }
        if(st==0) return arr.length;
        return st;
        // code here
        
    }
}
