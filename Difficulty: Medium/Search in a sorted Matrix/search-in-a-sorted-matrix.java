class Solution {
    public boolean searchMatrix(int[][] arr, int x) {
        // code here
        int n=arr.length;
        int m=arr[0].length;
        int st=0;
        int end=n*m-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int s=arr[mid/m][mid%m];
            if(s==x){
                return true;
            }
            else if(s>x){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return false;
    }
}
