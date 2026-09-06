class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        
        Map<Integer,Integer>ans=new HashMap<>();
        for(int n:arr){
            ans.put(n,ans.getOrDefault(n,0)+1);
        }
        int n=arr.length;
        ArrayList<Integer>num=new ArrayList<>();
        for(Map.Entry<Integer,Integer>e:ans.entrySet()){
            if(e.getValue()>(n/3)){
                num.add(e.getKey());
            }
        }
        Collections.sort(num);
        return num;
    }
}