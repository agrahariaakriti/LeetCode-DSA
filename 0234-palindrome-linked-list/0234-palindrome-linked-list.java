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
    public boolean isPalindrome(ListNode head) {
     if(head.next==null || head==null)
     return true;
     
     ListNode slow=head;
     ListNode fast=head;

     while(fast.next!=null && fast.next.next!=null)
     {
        slow=slow.next;
        fast=fast.next.next;
     }
     ListNode head2=reverse(slow.next);     
      while(head2!=null )
     {
      if(head.val!=head2.val)
      return false;
        head=head.next;
        head2=head2.next;
     }
         return true;

    }
    ListNode reverse(ListNode head)
    {
      if(head==null || head.next==null)
      return head;
      
        ListNode curr=head;
        ListNode next=head;
        ListNode prv=null;
        while(next!=null)
        {
            next=curr.next;
            curr.next=prv;
            prv=curr;
            curr=next;
        }
        return prv;

    }

}