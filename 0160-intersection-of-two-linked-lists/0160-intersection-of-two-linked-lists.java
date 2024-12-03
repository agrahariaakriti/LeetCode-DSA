/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> al=new HashSet<>();
        ListNode temp1=headA;
        while(temp1!=null)
        {
            al.add(temp1);
            temp1=temp1.next;
        }

        ListNode temp2=headB;
        while(temp2!=null)
        {
            if(al.contains(temp2))
            return temp2;
            // al.add(temp);
            temp2=temp2.next;
        }

        return null;
    }
}