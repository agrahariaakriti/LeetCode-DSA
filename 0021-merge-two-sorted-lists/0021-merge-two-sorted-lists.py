# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        Dummy_node=ListNode(0)
        temp=Dummy_node
        while list1!=None and list2!=None:
            if list1.val>=list2.val:
                new_node=ListNode(list2.val)
                temp.next=new_node
                list2=list2.next
            else:
                new_node=ListNode(list1.val)
                temp.next=new_node
                list1=list1.next
            temp=temp.next

        while list2!=None:
            new_node=ListNode(list2.val)
            temp.next=new_node
            list2=list2.next
            temp=temp.next
            
        while list1!=None:
            new_node=ListNode(list1.val)
            temp.next=new_node
            list1=list1.next
            temp=temp.next

        return Dummy_node.next