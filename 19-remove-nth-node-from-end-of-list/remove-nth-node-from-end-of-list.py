class Solution(object):
    def removeNthFromEnd(self, head, n):
        x = ListNode(0)
        x.next = head

        slow = x
        fast = x

        for i in range(n + 1):
            fast = fast.next

        while fast:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next
        return x.next