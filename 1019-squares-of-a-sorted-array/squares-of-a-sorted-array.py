class Solution(object):
    def sortedSquares(self, nums):
        n = len(nums)
        answer = [0] * n
        left = 0
        right = n - 1
        index = n - 1
        while left <= right:
            if abs(nums[left]) > abs(nums[right]):
                answer[index] = nums[left] * nums[left]
                left += 1
            else:
                answer[index] = nums[right] * nums[right]
                right -= 1
            index -= 1
        return answer