package Arrays.and.Hashing;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int[] resultarray = new int[nums.length * 2];
        int count = 0;

        for (int i = 0; i < resultarray.length; i++) {
            if (i == nums.length) count = 0;

            resultarray[i] = nums[count];
            count++;

        }
        return resultarray;
    }
}
