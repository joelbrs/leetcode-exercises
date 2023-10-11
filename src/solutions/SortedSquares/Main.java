package solutions.SortedSquares;

import static auxiliars.MergeSort.mergeSort;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 4,21,89,2,5,0,45 };

        int[] resp = Solution.sortedSquares(nums);

        for (int val : resp) {
            System.out.print(val + " ");
        }
    }
}

class Solution {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }

        return mergeSort(nums);
    }
}
