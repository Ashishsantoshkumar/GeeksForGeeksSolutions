
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int count=0;
        for(int n:arr){
            if(x>=n){
                count++;
            }
        }
        return count;
    }
}