class Solution
 {
    public void moveZeroes(int[] nums) 
    {
        int insertPos = 0;
        // First pass: shift all non-zero elements forward
        for (int num : nums)
         {
            if (num != 0) 
            {
                nums[insertPos] = num;
                insertPos++;
            }
        }
        // Second pass: fill the rest of the array with zeros
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}
