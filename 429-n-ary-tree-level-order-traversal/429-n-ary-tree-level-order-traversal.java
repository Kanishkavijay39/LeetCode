/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> mq=new ArrayDeque<>();
        Queue<Node> hq=new ArrayDeque<>();
        List<Integer> levelEle=new ArrayList<>();
        mq.add(root);
        while(mq.size()>0){
            Node rem=mq.remove();
            levelEle.add(rem.val);
            for(Node child:rem.children){
                hq.add(child);
            }
            if(mq.size()==0){
                ans.add(levelEle);
                levelEle=new ArrayList<>();
                Queue<Node> tmp=mq;
                mq=hq;
                hq=tmp;
            }
        }
        return ans;
    }
}