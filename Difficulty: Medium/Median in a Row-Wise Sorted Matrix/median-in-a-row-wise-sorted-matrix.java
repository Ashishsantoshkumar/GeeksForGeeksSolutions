class Solution {
    public int median(int[][] mat) {
        // code here
        
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                ans.add(mat[i][j]);
            }
        }
        Collections.sort(ans);
        int n=ans.size();
        if(n%2==0){
            return (ans.get(n / 2 - 1) + ans.get(n / 2)) / 2;
        }
        else{
            return ans.get(n/2);
        }
    }
}