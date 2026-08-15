class Solution {
    public int num(char ch){
        if(ch=='I'){
            return 1;
        }
        if(ch=='V'){
            return 5;
        }
         if(ch=='X'){
            return 10;
        }
         if(ch=='L'){
            return 50;
        }
         if(ch=='C'){
            return 100;
        }
         if(ch=='D'){
            return 500;
        }
         if(ch=='M'){
            return 1000;
        }
        return -1;
        
    }
    public int romanToInteger(String s) {
        
        int i=1;
        int sum=0;
        int n=s.length();
        while(i<n){
            if(num(s.charAt(i-1))>=num(s.charAt(i))){
                sum+=num(s.charAt(i-1));
            }
            else{
                sum-=num(s.charAt(i-1));
            }
            i++;
        }
        sum+=num(s.charAt(n-1));
        return sum;
        // code here
        
    }
}