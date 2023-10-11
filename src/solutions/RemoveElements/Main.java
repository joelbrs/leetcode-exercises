package solutions.RemoveElements;

public class Main {
    public static void main(String[] args) {
        //nums = [3,2,2,3], val = 3
        int[] nums = { 3, 2, 2, 3 };
        System.out.println(Solution.removeElement(nums, 3));
    }
}

class Solution {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
