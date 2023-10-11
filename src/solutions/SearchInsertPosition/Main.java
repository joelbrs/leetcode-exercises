package solutions.SearchInsertPosition;

public class Main {
    public static void main(String[] args) {
        //nums = [1,3,5,6], target = 5
        int[] nums = { 1, 3, 5, 6 };
        System.out.println(Solution.searchInsert(nums, 5));

        //nums = [1,3,5,6], target = 2
        System.out.println(Solution.searchInsert(nums, 2));

        //nums = [1,3,5,6], target = 7
        System.out.println(Solution.searchInsert(nums, 7));

        //nums = [1,3,5], target = 4
        int[] nums2 = {1, 3, 5};
        System.out.println(Solution.searchInsert(nums2, 4));
    }
}

class Solution {
    /*
    *
    * Given a sorted array of distinct integers and a target value, return the index if the target is found.
    * If not, return the index where it would be if it were inserted in order.
    *
    * You must write an algorithm with O(log n) runtime complexity.
    *
    *
    * */
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, insertionIndex = 0;

        if (nums[right] < target) {
            return right + 1;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
                insertionIndex++;
            }

            if (nums[mid] > target) {
                right = mid - 1;

                insertionIndex = right + left - (mid - 1);
            }
        }

        return insertionIndex;
    }
}