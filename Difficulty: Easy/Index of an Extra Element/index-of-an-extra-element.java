/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        
        for(int i=1;i<a.length;i++){
            if(a[i-1]!=b[i-1]){
                return i-1;
                
            }
        }
        return a.length-1;
    }
}