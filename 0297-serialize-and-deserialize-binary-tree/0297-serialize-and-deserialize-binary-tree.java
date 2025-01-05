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
       StringBuilder sb=new StringBuilder("");
       Queue<TreeNode> al=new LinkedList<>();
        if(root==null)return "";
        al.offer(root);
        while(!al.isEmpty())
        {
            TreeNode n1=al.poll();
            if(n1==null)
            {sb.append("# ");continue;}
            sb.append(n1.val+" ");
            // if(n1.left==null)
            al.add(n1.left);
            al.add(n1.right);
        }
        return sb.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="")
        return null;
        ArrayDeque<TreeNode> al=new ArrayDeque<>();
        String str[]=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(str[0]));
        al.add(root);
        int i=1;
        while(!al.isEmpty() && i<str.length)
        {
            TreeNode n1=al.poll();
            if(!str[i].equals("#"))
            {
                TreeNode left=new TreeNode(Integer.parseInt(str[i]));
                n1.left=left;
                al.offer(left);
            }
            if(!str[++i].equals("#"))
            {
                TreeNode right=new TreeNode(Integer.parseInt(str[i]));
                n1.right=right;
                al.offer(right);
            }   
            i++;   
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));