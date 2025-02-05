class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        
        // Step 1: Find the peak index
        int peak = findPeakIndex(mountainArr, n);
        
        // Step 2: Search in the left half (ascending order)
        int leftIndex = binarySearch(mountainArr, target, 0, peak, true);
        if (leftIndex != -1) return leftIndex;
        
        // Step 3: Search in the right half (descending order)
        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    // Finding the Peak Index using Binary Search
    private int findPeakIndex(MountainArray mountainArr, int n) {
        int start = 0, end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    // Standard Binary Search (Ascending or Descending)
    private int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean isAscending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);
            
            if (midValue == target) return mid;
            
            if (isAscending) {
                if (midValue < target) start = mid + 1;
                else end = mid - 1;
            } else { // Descending order
                if (midValue > target) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
