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
    public boolean hasCycle(ListNode head) {
        if(head==null)
        return false;
        if(head.next==head)
        return true;
        else if(head.next==null)
        return false;
        ListNode curr=head;
        ListNode next=head;
        ListNode dummy=new ListNode(-1);
        while(next!=null)
        {
            // next=next.next;
            if(curr.next==null)
            return false;
            if(curr.next==dummy)
            return true;
             
            next=next.next;
            curr.next=dummy;
            curr=next;
        }
        return false;
    }
}