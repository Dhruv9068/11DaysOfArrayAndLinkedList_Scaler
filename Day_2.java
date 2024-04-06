public class ElementsWithMinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 5, 1, 6};
        int count = elementsWithMinMax(arr);
        System.out.println("Number of elements with min-max within the array: " + count);
    }

    public static int elementsWithMinMax(int[] arr) {
        if (arr.length < 2) {
            return 0; // Need at least two elements for comparison
        }
        
        int min = arr[0];
        int max = arr[0];
        int count = 0;

        // Find minimum and maximum elements in the array
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Check elements with min-max property
        for (int num : arr) {
            if (num > min && num < max) {
                count++;
            }
        }

        return count;
    }
}
