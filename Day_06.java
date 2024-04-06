import java.util.Arrays;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5; // Change this to the desired row number
        int[] row = getPascalRow(n);
        System.out.println(Arrays.toString(row));
    }

    public static int[] getPascalRow(int n) {
        int[] row = new int[n + 1];
        row[0] = 1;

        for (int i = 1; i <= n; i++) {
            row[i] = row[i - 1] * (n - i + 1) / i;
        }

        return row;
    }
}
