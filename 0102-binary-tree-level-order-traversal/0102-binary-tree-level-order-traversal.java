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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        order(root, ans, 0);
        return ans;
    }
    private static void order(TreeNode root, List<List<Integer>> ls, int l){
        if(root == null) return;
        if(ls.size() == l){
            ls.add(new ArrayList<>());
            ls.get(l).add(root.val);
        } else{
            ls.get(l).add(root.val);
        }
        order(root.left, ls, l+1);
        order(root.right, ls, l+1);
    }
}