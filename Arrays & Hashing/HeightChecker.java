class Solution {
    public int heightChecker(int[] heights) {
        int[] heightarray = Arrays.copyOf(heights, heights.length);

        int count = 0;


        Arrays.sort(heights);

        for (int k = 0; k < heights.length; k++) {
            if (heights[k] != heightarray[k]) {
                count++;
            }
        }


        return count;

    }
}