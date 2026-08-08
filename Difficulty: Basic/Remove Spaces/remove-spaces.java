class Solution {
    public String removeSpaces(String s) {
        // code here
          String str="";
        for(char ch:s.toCharArray()){
            if(Character.isWhitespace(ch)) continue;
            
                str+=ch;
            
        }
        return str;
    }
}