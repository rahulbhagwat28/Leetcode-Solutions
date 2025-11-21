class Solution {
    public String largestGoodInteger(String num) {

        int j = 0;
        int max = Integer.MIN_VALUE;
        String result = "";

        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(j) && result.isEmpty()) {
                result = result + num.charAt(i) + num.charAt(j);

            } else if (num.charAt(i) == num.charAt(j) && result.length() != 3) {
                result = result + num.charAt(j);
            } else {
                result = "";
            }


            if (!result.isEmpty() && result.length() == 3) {
                max = Math.max(Integer.parseInt(result), max);
            }

            j++;
        }

        if (max == 0) {
            return "000";

        }
        if (max == Integer.MIN_VALUE) {
            return "";
        }

        return Integer.toString(max);
    }
}