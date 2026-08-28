class Solution {
    
    static boolean isPrime(int m){
        if(m<2) return false;
        for(int i=2;i*i<=m;i++){
            if(m%i==0){
                return false;
            }
        }
        return true;
    }
    public static ArrayList<Integer> getPrimes(int n) {
        // code here
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isPrime(i) && isPrime(n-i)){
                
                arr.add(i);
                arr.add(n-i);
                break;
            
            }
        }
        if(arr.size()==0){
            
        arr.add(-1);
        arr.add(-1);
        } 
        return arr;
        
        
    }
}
