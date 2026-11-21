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
    int idx=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx=postorder.length-1;
        return solve(inorder,postorder,0,inorder.length-1);
    }
    public TreeNode solve(int[] inorder, int[]postorder, int start, int end){
        if(start>end) return null;
        TreeNode root = new TreeNode(postorder[idx--]);
        int i = start;
        while(inorder[i]!=root.val) i++;
        root.right = solve(inorder,postorder,i+1,end);
        root.left=solve(inorder,postorder,start,i-1);
        return root;
    }
}