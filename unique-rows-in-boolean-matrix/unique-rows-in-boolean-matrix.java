class Solution {
    public ArrayList<ArrayList<Integer>> uniqueRow(int[][] mat) {
        // code here
        Set<ArrayList<Integer>>set=new LinkedHashSet<>();
        for(int []n:mat){
            ArrayList<Integer>num=new ArrayList<>();
            for(int i:n){
                num.add(i);
            }
            set.add(num);
        }
      return  new ArrayList<>(set);       
     
        
    }
}