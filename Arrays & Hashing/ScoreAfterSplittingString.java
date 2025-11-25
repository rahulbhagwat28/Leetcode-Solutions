class Solution {
    public int maxScore(String s) {

        char[] sarray = s.toCharArray();
        int countleft = 0;
        int countright = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < sarray.length - 1; i++) {

            countright = 0;

            if (sarray[i] == '0') {

                countleft++;

            }

            for (int j = i + 1; j < sarray.length; j++) {

                if (sarray[j] == '1') {
                    countright++;
                }

            }

            max = Math.max(max, countleft + countright);

        }

        return max;
    }
}