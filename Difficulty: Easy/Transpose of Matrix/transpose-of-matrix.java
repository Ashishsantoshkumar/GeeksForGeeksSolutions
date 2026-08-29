class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        int n=mat.length;
        int [][]temp=new int[n][n];
        for(int i=0;i<n;i++){
        
            for(int j=0;j<n;j++){
                temp[j][i]=mat[i][j];
            }
        }
        for(int i=0;i<n;i++){
            ArrayList<Integer>num=new ArrayList<>();
            for(int j=0;j<n;j++){
                num.add(temp[i][j]);
            }
            ans.add(num);
        }
        return ans;
    }
}