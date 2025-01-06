/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        StringBuilder sb=new StringBuilder("");
       Deque<TreeNode> al=new LinkedList<>();
        al.offer(root);
        while(!al.isEmpty())
        {
            TreeNode n=al.poll();
            if(n==null)
            {sb.append("# ");continue;}
            else
            sb.append(String.valueOf(n.val)+" ");
            al.offer(n.left);
            al.offer(n.right);
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="")return null;
        String str[]=data.split(" ");
        ArrayDeque<TreeNode> al=new ArrayDeque<>();
        TreeNode root=new TreeNode(Integer.parseInt(str[0]));
        al.add(root);
        int i=1;
        while(!al.isEmpty() && i<str.length)
        {
            TreeNode n=al.poll();
            if(!str[i].equals("#"))
            {
                TreeNode left=new TreeNode(Integer.parseInt(str[i]));
                n.left=left;
                al.offer(left);
            }
            if(!str[++i].equals("#"))
            {
                TreeNode right=new TreeNode(Integer.parseInt(str[i]));
                n.right=right;
                al.offer(right);
            }
            ++i;
        }  
        return root;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));