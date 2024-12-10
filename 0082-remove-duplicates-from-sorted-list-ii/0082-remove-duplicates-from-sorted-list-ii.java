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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
        return head;
        
     ListNode temp=head;
     HashMap<ListNode,Integer> al=new HashMap<>();
     while(temp.next!=null)
     {
        if(temp.val==temp.next.val)
        {
            al.put(temp,temp.val);
            temp.next=temp.next.next;
        }
        else
        {
            temp=temp.next;
        }
     } 
    for(Map.Entry<ListNode,Integer> e:al.entrySet())
    {
        ListNode temp2=e.getKey();
        head=delete(head,temp2);
    }
    return head;
    }
    static ListNode delete(ListNode head,ListNode node)
    {
        if(node==head)
        {
            head=head.next;
        }
        else
        {
            ListNode temp=head;
            while(temp.next!=node)
            temp=temp.next;
            temp.next=temp.next.next;
        }
        return head;
    }
}