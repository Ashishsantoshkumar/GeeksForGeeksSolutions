import java.util.*;

class Solution {
    public void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(i==index){
                ans.add(val);
            }
            ans.add(arr.get(i));
            
        }
        if(index==arr.size()) ans.add(val);
        arr.clear();
        
        arr.addAll(ans);
    }
}
