class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int j = 1;
        int inccount = 1;
        int deccount = 1;
        int min = 1;
        int max = 1;

        for (int i = 0; i < nums.length; i++) {
            if (j != nums.length && nums[j] > nums[i]) {
                inccount++;
                deccount = 1;

            } else if (j != nums.length && nums[j] < nums[i]) {
                inccount = 1;
                deccount++;

            } else {
                inccount = 1;
                deccount = 1;
            }
            max = Math.max(inccount, max);
            min = Math.max(deccount, min);
            j++;
        }

        return Math.max(max, min);
    }
}