class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length; // If array is small, return as is.

        int count = 1;  // Tracks index where valid numbers are placed
        int occurrence = 1;  // Tracks occurrence of the current number

        for (int i = 1; i < nums.length; i++) {  // Start from 1, as we assume nums[0] is included
            if (nums[i] == nums[i - 1]) {  // Compare with previous element
                occurrence++;
            } else {
                occurrence = 1;  // Reset occurrence when a new number appears
            }

            if (occurrence <= 2) {  // Allow at most 2 occurrences
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}
