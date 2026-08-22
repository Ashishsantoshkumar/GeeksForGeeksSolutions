class Solution {
    public int thirdLargest(List<Integer> arr) {
        // code here
        int fi=Integer.MIN_VALUE,se=Integer.MIN_VALUE,th=Integer.MIN_VALUE;
        
        for(int n:arr){
            if(n>fi){
                th=se;
                se=fi;
                fi=n;
            }
            else if(n>se && n<=fi){
                th=se;
                se=n;
            }
            else if(n>th && n<=se){
                th=n;
            }
        }
        return th==Integer.MIN_VALUE?-1:th;
        
    }
}