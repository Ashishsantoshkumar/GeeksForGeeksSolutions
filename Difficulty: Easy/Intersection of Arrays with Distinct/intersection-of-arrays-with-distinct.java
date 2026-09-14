class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        List<Integer>ans=new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                j++;
                
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        return ans.size();
    }
}