class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n=mat.length;
        int[][] trans=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                trans[j][i]=mat[i][j];
            }
        }
       
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=trans[n-1-i][j];
            }
        }
    }
}