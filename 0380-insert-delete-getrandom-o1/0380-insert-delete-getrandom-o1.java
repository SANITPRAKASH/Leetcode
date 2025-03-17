import java.util.*;

class RandomizedSet {
    private HashMap<Integer, Integer> valToIndex; // Stores value -> index
    private ArrayList<Integer> nums; // Stores values
    private Random rand;

    public RandomizedSet() {
        valToIndex = new HashMap<>();
        nums = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (valToIndex.containsKey(val)) return false; // Value exists, return false
        valToIndex.put(val, nums.size()); // Store value and index
        nums.add(val); // Add value to list
        return true;
    }

    public boolean remove(int val) {
        if (!valToIndex.containsKey(val)) return false; // Value not found
        int index = valToIndex.get(val);
        int lastElement = nums.get(nums.size() - 1);

        // Swap the element to remove with the last element
        nums.set(index, lastElement);
        valToIndex.put(lastElement, index);

        // Remove last element
        nums.remove(nums.size() - 1);
        valToIndex.remove(val);
        return true;
    }

    public int getRandom() {
        return nums.get(rand.nextInt(nums.size())); // Return random element
    }
}
