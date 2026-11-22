class Solution {
    public void sortIt(int[] arr) {
        // code here
        List<Integer>odd=new ArrayList<>();
        List<Integer>even=new ArrayList<>();
        for(int n:arr){
            if(n%2==0){
                even.add(n);
            }
            else{
                odd.add(n);
            }
        }
        
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
        
        int i=0;
        for(int n:odd){
            arr[i++]=n;
        }
        for(int m:even){
            arr[i++]=m;
        }
        return;
        
        
        
        
        
        
        
    }
}
