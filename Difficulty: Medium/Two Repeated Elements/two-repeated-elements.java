class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
       
        List<Integer>x=new ArrayList<>();
        Map<Integer,Integer>num=new HashMap<>();
        
        for(int n:arr){
            num.put(n,num.getOrDefault(n,0)+1);
            if(num.get(n)>1){
                x.add(n);
            }
        }
         int []ans=new int[x.size()];
        for(int i=0;i<x.size();i++){
            ans[i]=x.get(i);
        }
        return ans;
    }
}