class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(i+1==arr[i]){
                ans.add(arr[i]);
            }
        }
        return ans;
        
    }
}
