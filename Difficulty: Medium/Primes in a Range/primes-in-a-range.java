class Solution {
    
    boolean isPrime(int n){
        if(n<=1) return false;
        for(int j=2;j*j<=n;j++){
            if(n%j==0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> primeRange(int l, int r) {
        
        // code here
        
        List<Integer> ans=new ArrayList<>();
        
        for(int i=l;i<=r;i++){
            if(isPrime(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}