class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        Map<Integer,Integer>ans=new HashMap<>();
        for(int n:arr){
            ans.put(n,ans.getOrDefault(n,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : ans.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        return -1;
    }
}