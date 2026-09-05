//Time Complexity= O(n)
//Space Complexity = O(n)
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store number values and their corresponding indices
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // If the complement exists in the map, return the solution
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // Store current number and its index
            map.put(nums[i], i);
        }
        // Return empty array if no solution is found (guaranteed not to reach here based on constraints)
        return new int[] {};
    }
}