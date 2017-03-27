/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.lang.*;
public class Solution {
    public int maxDepth(TreeNode root) {
        int max;
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 1;
        
        if(root.left!=null&&root.right==null) return maxDepth(root.left)+1;
        if(root.right!=null&&root.left==null) return maxDepth(root.right)+1;
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }
}