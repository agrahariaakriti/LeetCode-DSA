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
    public ListNode detectCycle(ListNode head) {
    HashMap<ListNode,Integer> al=new HashMap<>();
    ListNode temp=head;
    int count=0;
    while(temp!=null)
    {
        if(al.containsKey(temp.next))
        return temp.next;
        else{
        al.put(temp,count++);
        temp=temp.next;}
    }
    return null;

    }
}