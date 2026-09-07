class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        String s=arr[0];
        String end=arr[n-1];
        int minLen=Math.min(s.length(),end.length());
        String ans="";
        for(int i=0;i<minLen;i++){
            if(s.charAt(i)!=end.charAt(i)){
                break;
            }
            ans+=s.charAt(i);
        }
        return ans;
    }
}