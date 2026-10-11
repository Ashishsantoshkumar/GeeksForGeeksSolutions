class Solution {
    public int primeSum(int n) {
        // code here
        if (n < 2) return 0;
        boolean[] prime=new boolean[n+1];
        prime[0]=false;
        prime[1]=false;
        
        for(int i=2;i<=n;i++){
            prime[i]=true;
        }
        
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        int sum=0;
        for(int i=2;i<=n;i++){
            if(prime[i]==true){
                sum+=i;
            }
            
        }
        return sum;
    }
}