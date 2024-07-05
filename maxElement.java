public class MaxElementInArray {

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 2, 7, 1};
        int max = findMax(arr);
        System.out.println("Maximum element in the array: " + max);
    }

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
