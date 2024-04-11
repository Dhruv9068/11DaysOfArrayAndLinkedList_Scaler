// Problem Statement:
// Given a read-only array of n integers from 1 to n, with one number appearing twice and one number missing, find the missing number and the duplicate number. Return them, ensuring the missing number precedes the duplicate number.

// Example:
// Input: [3, 1, 2, 5, 3]
// Output: [3, 4]

// Input: [1, 2, 2, 4]
// Output: [2, 3]

import java.util.*;

public class FindMissingAndDuplicate {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }
        
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                result.add(nums[i]);
                result.add(i + 1);
                break;
            }
        }
        
        return result;
    }
    
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 3};
        List<Integer> result = findDuplicates(nums);
        System.out.println("Output: " + result); // Output: [3, 4]
    }
}
