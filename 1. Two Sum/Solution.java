public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1}; // if no solution
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 7, 12, 8};
        int target = 12;

        int[] res = twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }
}
