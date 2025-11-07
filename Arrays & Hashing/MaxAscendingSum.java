class Solution {
    public int maxAscendingSum(int[] nums) {

        int j=1;
        int sum=nums[0];
        int max=Integer.MIN_VALUE;


        max=Math.max(sum,max);

        for(int i=0;i<nums.length;i++)
        {
            if(j!=nums.length && nums[j]>nums[i])
            {
                sum=sum+nums[j];
            }
            else if(j!=nums.length && nums[j]<=nums[i]){
                sum=nums[j];
            }

            max=Math.max(sum,max);

            j++;


        }

        return max;
    }
}