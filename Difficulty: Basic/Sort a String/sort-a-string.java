class Solution {
    public String sortString(String s) {
        // code here
         char[] ch=s.toCharArray();
        Arrays.sort(ch);
        String st=new String(ch);
        return st;
    }
}