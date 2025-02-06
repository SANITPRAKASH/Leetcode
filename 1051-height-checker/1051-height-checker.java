public class Solution {
    public int heightChecker(int[] heights) {
        // Create a copy of the heights array to avoid modifying the original
        int[] expected = heights.clone();
        
        // Sort the expected array using Bubble Sort
        bubbleSort(expected);
        
        // Compare and count mismatches
        return countMismatches(heights, expected);
    }

    // Bubble Sort function
    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Function to compare the two arrays and count mismatches
    private int countMismatches(int[] heights, int[] expected) {
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
}
