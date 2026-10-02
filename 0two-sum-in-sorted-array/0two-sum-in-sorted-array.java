class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int st=0,end=arr.length-1;
        while(st<end){
            int sum=arr[st]+arr[end];
            if(sum==target){
                ans.add(st+1);
                ans.add(end+1);
                return ans;
            }
            else if(sum>target){
                end--;
            }
            else{
                st++;
            }
        }
        ans.add(-1);
                ans.add(-1);
        return ans;
        
    }
}