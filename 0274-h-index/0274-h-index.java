import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
    int n = citations.length;
    int[] count = new int[n + 1];

    // Step 1: Count how many papers have citations >= i
    for (int c : citations) {
        if (c >= n) {
            count[n]++;
        } else {
            count[c]++;
        }
    }

    // Step 2: Go from back, find max h
    int total = 0;
    for (int i = n; i >= 0; i--) {
        total += count[i];
        if (total >= i) {
            return i;
        }
    }

    return 0;
}

}
