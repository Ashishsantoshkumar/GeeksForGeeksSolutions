class Solution {
    String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(sb.indexOf(String.valueOf(ch))==-1){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
