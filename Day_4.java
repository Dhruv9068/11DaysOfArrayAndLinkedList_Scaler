public class LongestOddEvenSubsequence {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 5, 6};
        int result = longestOddEvenSubsequence(A);
        System.out.println("Output: " + result);
    }

    public static int longestOddEvenSubsequence(int[] A) {
        int oddCount = 0;
        int evenCount = 0;

        for (int num : A) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (evenCount == oddCount) {
            return A.length;
        } else {
            int excess = Math.abs(evenCount - oddCount);
            return A.length - excess;
        }
    }
}
