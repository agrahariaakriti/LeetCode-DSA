/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
    HashSet<ListNode> al=new HashSet<>();
    ListNode temp=head;
    while(temp!=null)
    {
        if(al.contains(temp.next))
        return temp.next;
        else{
        al.add(temp);
        temp=temp.next;}
    }
    return null;

    }
}