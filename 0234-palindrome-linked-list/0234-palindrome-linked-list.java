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

    // if(fast.next.next==null)
    // {
    //     if(slow.val==fast.next.val)
    //     return true;
    //     else
    //      return false;
    // }
    // if(head2.next==null)
     while(fast.next!=null && fast.next.next!=null)
     {
        slow=slow.next;
        fast=fast.next.next;
     }
     ListNode head2=reverse(slow.next);
    //  slow.next=head2;
     
     ListNode h1=head;
     ListNode h2=head2;
     while(h2!=null )
     {
      if(h1.val!=h2.val)
      return false;
        h1=h1.next;
        h2=h2.next;
     }
    //  if(h2=null)
    //  return false;

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