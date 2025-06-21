import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations); // Sort in ascending order
        int n = citations.length;
        
        int h = 0;
        for (int i = 0; i < n; i++) {
            int papers = n - i; // Number of papers with at least citations[i] citations
            if (citations[i] >= papers) {
                return papers;
            }
        }
        return 0;
    }
}
