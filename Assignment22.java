import java.util.HashSet;

public class DistinctAbsoluteValues {

    public static int countDistinctAbsoluteValues(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(Math.abs(num));
        }

        return set.size();
    }

    public static void main(String[] args) {

        int[] arr = {-5, 5, -3, 3, 3, 0};

        int result = countDistinctAbsoluteValues(arr);

        System.out.println("Number of distinct absolute values: " + result);
    }
}
