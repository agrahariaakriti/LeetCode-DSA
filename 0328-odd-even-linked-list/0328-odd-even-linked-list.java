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
    public ListNode oddEvenList(ListNode head) {
        int index=0;

        if(head==null)
        return null;
        if(head.next==null)
        return head;
        else
        {   
             ListNode evenstart=null;
             ListNode evenend=null; 
             ListNode oddstart=null;
             ListNode oddend=null;
             ListNode temp=head;   

             while(temp!=null)
             {
                if(index%2==0)
                {
                    if(evenstart==null)
                    {
                        evenstart=temp;
                        evenend=temp;
                    }
                    else
                    {
                        evenend.next=temp;
                        evenend=temp;
                    }
                }
                else
                {
                    if(oddstart==null)
                    {
                        oddstart=temp;
                        oddend=temp;
                    }
                    else
                    {
                        oddend.next=temp;
                        oddend=temp;
                    }
                }
                index++;
                temp=temp.next;
             } 
             if(evenstart==null)
             return oddstart;
           
             if(oddstart==null)
             return evenstart;
           
             evenend.next=oddstart;
             oddend.next=null;
             return evenstart;
        }
        
    }
}