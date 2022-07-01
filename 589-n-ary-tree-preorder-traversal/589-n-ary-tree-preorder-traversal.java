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
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> res =new ArrayList<>();
        if(root==null) return res;
        //create stack
        Stack<Node> st =new Stack<>();
        st.push(root);
        
        while(st.size()!=0){
            //remove
            Node rem =st.pop();
            //add print
            res.add(rem.val);
            //add child
            for(int i=rem.children.size()-1;i>=0;i--)
		{
			st.push(rem.children.get(i));
		}
        }
    return res;
    }}
    
    