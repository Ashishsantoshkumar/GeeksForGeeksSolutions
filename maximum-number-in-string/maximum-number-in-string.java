class Solution {
    static int extractMaximum(String s) {
        // code here
        List<Integer>ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                sb.append(ch);
            }
            else{
                if(sb.length()>0){
                    ans.add(Integer.parseInt(sb.toString()));
                    sb.setLength(0);
                }
            }
        }
        
        if(sb.length()>0){
                    ans.add(Integer.parseInt(sb.toString()));
                   
                }
        int maxNo=-1;
        for(int n:ans){
            maxNo=Math.max(maxNo,n);
        }
        return maxNo;
    }
}
