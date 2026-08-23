class Solution {
    public void rearrange(int arr[]) {
        // code here
        Arrays.sort(arr);
        
        int[] ans=new int[arr.length];
        
        List<Integer> num=new ArrayList<>();
        for(int i=0;i<=arr.length/2;i++){
            num.add(arr[arr.length-1-i]);
            num.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            ans[i]=num.get(i);
            arr[i]=ans[i];
        }
        
    }
}
