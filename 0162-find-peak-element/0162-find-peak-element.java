class Solution {
    public int findPeakElement(int[] nums) {
         int start = 0;
        int end = nums.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] > nums[mid + 1]) {
                // We are in decreasing part of array
                // This may be the answer, but look at left
                // This is why end != mid - 1
                end = mid;
            } else {
                // We are in ascending part of array
                start = mid + 1;
            }
        }
        // In the end, start == end and pointing to the peak
        return start;
        
    }
}