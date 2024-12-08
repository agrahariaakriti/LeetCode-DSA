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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)
        return null;
        ListNode  temp=head;
        int count=0,count1=1;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        temp=head;
        int ind=(int)Math.ceil(count/2);
        while(count1<ind)
        {
            count1++;
            temp=temp.next;
        }
        if(temp.next==null)
       { temp.next=null;
        return head;}
        temp.next=temp.next.next;
        return head;
    }
}