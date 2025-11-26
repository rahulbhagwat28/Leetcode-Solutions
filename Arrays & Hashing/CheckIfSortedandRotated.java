

//Brute force approach

class Solution {
    public boolean check(int[] nums) {

        if (nums.length == 1) return true;

        for (int i = 0; i < nums.length; i++) {
            if (IsSorted(nums)) return true;
            rotate(nums);


        }

        return false;
    }


    public boolean IsSorted(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public void rotate(int[] nums) {
        int last = nums[nums.length - 1];

        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];

        }
        nums[0] = last;
    }


}


//Optimal one pass approach

class Solution {
    public boolean check(int[] nums) {
        int nbreak = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                nbreak++;
            }
        }

        if (nbreak == 0) {

            return true;
        }

        if (nums[nums.length - 1] > nums[0])
            nbreak++;

        return nbreak <= 1;

    }
}