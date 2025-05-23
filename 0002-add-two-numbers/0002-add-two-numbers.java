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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode tail=null;
        int carry=0;
    while(l1!=null || l2!=null)
    {
        int sum=carry;
        if(l1!=null)
        {
            sum+=l1.val;
            l1=l1.next;
        }
        if(l2!=null)
        {
            sum+=l2.val;
            l2=l2.next;
        }
        ListNode n1=new ListNode(sum%10);
        if(head==null)
        {
            head=n1;
            tail=n1;
        }
        else
        {
            tail.next=n1;
            tail=n1;
        }
        carry=sum/10;
    }
    if(carry>0){
        ListNode n1=new ListNode(carry);
        tail.next=n1;
    }
    return head;
    }
}