# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseKGroup(self, head, k):
        start=head
        end=head
        next_start=None
        count=0
        while(end!=None):
            count+=1
            if k==count:
                if end.next!=None:
                    next_start=end.next
                else:
                    next_start=None    
                end.next=None
                # prv=start
                head2=self.reverse(start)
                if start==head:
                    head=head2
                else:
                    prv.next=head2
                if next_start!=None:    
                    prv=start    
                    start=next_start
                    end=next_start
                    count=1

            if next_start!=None:
                prv.next=next_start
            end=end.next

        return head
    
    def reverse(self,head):
        curr=head
        next=head
        prv=None
        while(next!=None):
            next=next.next
            curr.next=prv
            prv=curr
            curr=next        
        return prv    