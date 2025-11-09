class Solution {
    public int pivotIndex(int[] nums) {

        int totalsum = 0;

        int right = 0;
        int left = 0;


        for (int num : nums) {
            totalsum = totalsum + num;
        }
        for (int i = 0; i < nums.length; i++) {

            if (i == 0) {
                left = 0;
            } else {
                left = left + nums[i - 1];
            }
            if (i == nums.length - 1) {
                right = 0;
            } else {
                right = totalsum - (nums[i] + left);
            }
            if (left == right)
                return i;
        }
        return -1;
    }

}