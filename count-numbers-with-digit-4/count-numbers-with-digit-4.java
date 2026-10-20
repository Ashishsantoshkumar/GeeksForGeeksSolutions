class Solution {
    public static int countNumberswith4(int n) {
        // code here
        int count=0;
      
        
        for(int i=1;i<=n;i++){
            int m=i;
            while(m!=0){
                int last=m%10;
                if(last==4){
                    count++;
                    break;
                }
                m/=10;
            }
        }
        
        
        return count;
    }
}
