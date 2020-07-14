/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If Both (p) && (q) are null
        if(p==null && q==null)
            return true;
        
        // If anyone of (p) && (q) is null
        if(p==null || q==null)
            return false;
        
        // If (p.val) != (q.val) return false
        if(p.val!=q.val)
            return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        
    }
    
    
}