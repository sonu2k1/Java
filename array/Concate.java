import java.util.Arrays;

public class ArrayConcatenation {
    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        // Create a new array to hold the concatenated result
        int[] result = new int[arr1.length + arr2.length];

        // Copy elements from the first array
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        // Copy elements from the second array
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] concatenatedArray = concatenateArrays(arr1, arr2);
        System.out.println(Arrays.toString(concatenatedArray));
    }
}
