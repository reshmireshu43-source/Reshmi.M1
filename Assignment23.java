import java.util.HashMap;

public class TwoSum {

    public static int[] findTwoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            // Check if complement already exists
            if (map.containsKey(complement)) {
                int index1 = map.get(complement);
                int index2 = i;

                // Indices are automatically in ascending order
                return new int[]{index1, index2};
            }

            // Store value and its index
            map.put(arr[i], i);
        }

        // No pair found
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSum(arr, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
