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
        
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        List<Integer> temp=new ArrayList<>();
        Queue<TreeNode> curr= new ArrayDeque<>();
        Queue<TreeNode> help=new ArrayDeque<>();
        curr.add(root);
        while(curr.size()>0){
            //remove
            TreeNode rem=curr.remove();
            //print
            temp.add(rem.val);
            //add
            if(rem.left!=null) help.add(rem.left);
            if(rem.right!=null) help.add(rem.right);
            if(curr.size()==0){
                ans.add(temp);
                temp=new ArrayList<>();
                Queue<TreeNode> t=curr;
                curr=help;
                help=t;
            }
            
        }
        return ans;
    }
}