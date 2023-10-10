package solutions.MergeSortedArray;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6}; int m = 3, n = 3;

        Solution.merge(nums1, m, nums2, n);
    }
}

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergedArray = new int[m+n];
        int i = 0, j = 0, index = 0;

        while (i < m && j < n) {
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

        while (i < m) {
            mergedArray[index] = nums1[i];
            i++;
            index++;
        }

        while (j < n) {
            mergedArray[index] = nums2[j];
            j++;
            index++;
        }

        for (int k = 0; k < mergedArray.length; k++) {
            nums1[k] = mergedArray[k];
        }
    }
}
