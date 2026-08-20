class Solution {
    public ArrayList<Integer> sieve(int n) {
        // code here
        boolean[] prime=new boolean[n+1];
        prime[0]=false;
        prime[1]=false;
        
        for(int i=2;i<=n;i++){
            prime[i]=true;
        }
        
        for(int i=2;i*i<=n;i++){
            if(prime[i]==true){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(prime[i]==true){
                ans.add(i);
            }
        }
        return ans;
    }
}