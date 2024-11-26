/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prv=null;
        ListNode curr=head;
        ListNode next=head;

        while(next!=null)
        {
            next=next.next;
            curr.next=prv;
            prv=curr;
            curr=next;
        }
        head=prv;
        return head;
    }
}