class Solution {
    public int termOfGP(int a, int b, int n) {
        // code here
        
        if(n==1) return a;
        int r=b/a;
        
        int m=(int)Math.pow(r,n-1);
        int ans=a*m;
        return ans;
    }
};