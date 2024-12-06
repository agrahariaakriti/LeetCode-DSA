/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        HashMap<Node,Node> al=new HashMap<>();

        Node temp=head;
        while(temp!=null)
        {
            al.put(temp,new Node(temp.val));
            temp=temp.next;
        }

        Node original=head;
        while(original!=null)
        {
            Node clone=al.get(original);
            clone.next=al.get(original.next);
            clone.random=al.get(original.random);
            original=original.next;
        }
        return al.get(head);
    }
}