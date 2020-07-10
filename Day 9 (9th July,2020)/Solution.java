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
    private List<List<Integer>> layerInterval;
    
    public int widthOfBinaryTree(TreeNode root) {
        //use lists to store start and end position for each layer,
        //use a list to store the list of each layer.
        layerInterval = new ArrayList<>();
        helper(root, 0, 0);
        int maxWidth = 0;
        for (List<Integer> interval: layerInterval)
            maxWidth = Math.max(maxWidth, interval.get(1)-interval.get(0) + 1);
        
        return maxWidth;
    }
    
    public void helper(TreeNode root, int layerNum, int pos)
    {
        if (root == null)
            return;
        
        if (layerInterval.size() <= layerNum)  //at beginning layerMax size == 1;
        {       
            List<Integer> interval = new ArrayList<>();
            interval.add(pos);
            interval.add(pos);
            layerInterval.add(interval);
        }
        else
            layerInterval.get(layerNum).set(1,pos);
        
        
        helper(root.left, layerNum+1, pos*2 );
        helper(root.right, layerNum+1, pos*2 + 1);
        
    }
}