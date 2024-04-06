public class MinDeletionsForEvenSumAdjacent {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int minDeletions = minDeletionsForEvenSumAdjacent(arr);
        System.out.println("Minimum deletions required: " + minDeletions);
    }

    public static int minDeletionsForEvenSumAdjacent(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Minimum deletions required will be the minimum of even and odd count
        return Math.min(evenCount, oddCount);
    }
}
