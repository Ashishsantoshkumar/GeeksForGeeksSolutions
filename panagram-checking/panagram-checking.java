class Solution {
    public static boolean checkPangram(String s) {
        // code here
        s=s.replaceAll("[^a-zA-Z]","");
        s=s.toLowerCase();
        for(char ch='a';ch<='z';ch++){
            if(!s.contains(String.valueOf(ch))) return false;
        }
        return true;
        
    }
}