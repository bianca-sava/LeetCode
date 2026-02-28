
class ListNode:
     def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def mergeTwoLists(self, list1: ListNode, list2: ListNode) -> ListNode:
        res = ListNode()
        head = res
        while list1 and list2:
            if list1.val < list2.val:
                res.next = ListNode()
                res.next.val = list1.val
                list1 = list1.next
                res = res.next
            else:
                res.next = ListNode()
                res.next.val = list2.val
                list2 = list2.next
                res = res.next

        if list1:
            res.next = list1
        if list2:
            res.next = list2

        return  head.next
