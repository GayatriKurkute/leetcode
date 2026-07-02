class Solution(object):
    def removeElements(self, head, val):

        dum = ListNode(0)
        dum.next = head

        current = dum

        while current.next:
            if current.next.val == val:
                current.next = current.next.next
            else:
                current = current.next

        return dum.next
        