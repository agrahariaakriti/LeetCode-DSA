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
    public ListNode reverseKGroup(ListNode head, int k) {
      ListNode temp=head;
      int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        return reverse(head,k,size);

    }
    static ListNode reverse(ListNode head,int k,int size)
    {
        ListNode curr=head;
        // ListNode next=head;
        ListNode prv=null;
         ListNode next=head;
        int count=0;
        while(curr!=null && count<k)
        {
            next=next.next;
            curr.next=prv;
            prv=curr;
            curr=next;
            count++;
            size--;
        }
        if(next!=null && size>=k)
        {
            ListNode rest_head=reverse(curr,k,size);
            head.next=rest_head;
        }
        if(size<k)
        {
            head.next=curr;
            return prv;
        }
        return prv;
    }

}