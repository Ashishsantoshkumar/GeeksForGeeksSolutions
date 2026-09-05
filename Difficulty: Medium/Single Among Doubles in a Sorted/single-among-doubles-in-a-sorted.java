class Solution {
    int single(int[] arr) {
        // code here
        Map<Integer,Integer>ans=new HashMap<>();
        for(int n:arr){
            ans.put(n,ans.getOrDefault(n,0)+1);
        }
      for (int key : ans.keySet()) {
          if (ans.get(key) == 1) {
              return key;
          }
      }
        return -1;
    }
}