class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] > arr[mid + 1]) {
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