package DSA_PROBLEMS;
import java.util.HashMap;
import java.util.HashSet;

public class ChemicalProb1 {
	public int findPair(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Traverse the array
        for (int j = 0; j < arr.length; j++) {
            // Required value to satisfy the condition: arr[i] = arr[j] + target
            int required = arr[j] + target;

            // Check if required value exists in the map
            if (map.containsKey(required)) {
                int i = map.get(required);
              // Sum of arr[i] and arr[j]
                return arr[i] + arr[j];
            }

            // Add the current element to the map
            map.put(arr[j], j);
        }

        // No valid pair found
        return -1;
	}
}


