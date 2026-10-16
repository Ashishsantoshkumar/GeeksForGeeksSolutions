class Solution {
    public int mean(int[] arr) {
        // code here
        int sum=0;
        for(int n:arr){
            sum+=n;
        }
        return sum/arr.length;
    }

    public int median(int[] arr) {
        // code here
        Arrays.sort(arr);
        int x=arr.length;
        if(x%2!=0){
            return arr[x/2];
        }
        return (arr[(x/2)-1]+arr[x/2])/2;
    }
}