class Solution {
    public ArrayList<String> smallerAndLarge(String s) {
        // code here
       String[] st = s.split("\\s+");
       int minLen=Integer.MAX_VALUE;
       int maxLen=-1;
       String minWord="";
       String maxWord="";
       
       for(String x:st){
           int len=x.length();
           if(len<minLen){
               minLen=len;
               minWord=x;
           }
            if(len>=maxLen){
               maxLen=len;
               maxWord=x;
           }
       }
       ArrayList<String>ans=new ArrayList<>();
       ans.add(minWord);
       ans.add(maxWord);
       
       return ans;
    }
}