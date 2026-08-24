/* Structure of Height
class Height {
    int feet;
    int inches;

    // Constructor to initialize the Height object
    Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }
}
*/
class Solution {
    public int findMax(ArrayList<Height> arr) {
        // code here
        int maxNo=-1;
        for(Height h:arr){
            int total=h.feet*12+h.inches;
            maxNo=Math.max(maxNo,total);
        
        
        }
        return maxNo;
    }
}