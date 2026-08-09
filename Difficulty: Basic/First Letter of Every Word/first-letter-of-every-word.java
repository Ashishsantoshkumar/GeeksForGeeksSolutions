class Solution {
    String firstAlphabet(String s) {
        // code here
        String [] num=s.split(" ");
        String st="";
        for(String an:num){
            st+=an.charAt(0);
        }
        return st;
        
    }
};