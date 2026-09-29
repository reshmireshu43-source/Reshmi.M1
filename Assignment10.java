public class Sorting {

    public static void main(String[] args) {

        int[] arr1 = {64, 25, 12, 22, 11};
        int[] arr2 = {64, 25, 12, 22, 11};

        // Selection Sort
        for (int i = 0; i < arr1.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[j] < arr1[min]) {
                    min = j;
                }
            }

            int temp = arr1[i];
            arr1[i] = arr1[min];
            arr1[min] = temp;
        }

        System.out.println("Selection Sort:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }

        // Insertion Sort
        for (int i = 1; i < arr2.length; i++) {
            int key = arr2[i];
            int j = i - 1;

            while (j >= 0 && arr2[j] > key) {
                arr2[j + 1] = arr2[j];
                j--;
            }

            arr2[j + 1] = key;
        }

        System.out.println("\nInsertion Sort:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
