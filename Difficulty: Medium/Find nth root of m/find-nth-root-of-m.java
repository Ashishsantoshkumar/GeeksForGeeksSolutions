class Solution {
    public int nthRoot(int n, int m) {
        // code here
        
        int ans=-1;
        if(m==0) return 0;
        
        for(int i=1;i<=m;i++){
            int x=(int)Math.pow(i,n);
            if(x==m){
                ans=i;
                break;
            }
        }
        return ans;
        
    }
}