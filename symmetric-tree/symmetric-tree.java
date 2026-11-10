/* Structure of binary tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean isSymmetric(Node root) {
        
       if(root==null){
           return true;
       }
       
       return isSame(root.left,root.right);
        
    }
    
    
    public boolean isSame(Node left,Node right){
        if(left==null && right==null){
            return true;
        }
        
          if(left==null || right==null){
            return false;
        }
        
        if(left.data!=right.data) return false;
        return isSame(left.left,right.right) && isSame(left.right,right.left);
    }
}