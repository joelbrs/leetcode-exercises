package auxiliars;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }

        int midIndex = nums.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(nums, midIndex, nums.length));

        return merge(left, right);
    }

    private static int[] merge(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length+ nums2.length];
        int i = 0, j = 0, index = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                mergedArray[index] = nums2[j];
                index++;
                j++;
            } else {
                mergedArray[index] = nums1[i];
                index++;
                i++;
            }
        }

        while (i < nums1.length) {
            mergedArray[index] = nums1[i];
            i++;
            index++;
        }

        while (j < nums2.length) {
            mergedArray[index] = nums2[j];
            j++;
            index++;
        }

        return mergedArray;
    }
}
