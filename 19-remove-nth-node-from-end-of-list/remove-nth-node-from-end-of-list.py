class Solution(object):
    def removeNthFromEnd(self, head, n):
        xh = ListNode(0)
        xh.next = head

        slow = xh
        fast = xh

        for i in range(n + 1):
            fast = fast.next

        while fast:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next
        return xh.next
        