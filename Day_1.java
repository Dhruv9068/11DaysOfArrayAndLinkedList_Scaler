public class MaxModValue {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 7};
        System.out.println("Maximum value: " + maxModValue(arr1)); // Output: 3
        
        int[] arr2 = {3, 7, 4, 11};
        System.out.println("Maximum value: " + maxModValue(arr2)); // Output: 4
    }

    public static int maxModValue(int[] arr) {
        int maxMod = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    int mod = arr[i] % arr[j];
                    maxMod = Math.max(maxMod, mod);
                }
            }
        }

        return maxMod;
    }
}
