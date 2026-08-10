class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int st=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=target){
                st=i;
                break;
            }
        }
        if(st==-1){
            return arr.length;
        }
        return st;
    }
}
