//even max frequency - odd min frequency
class Solution {
    public int maxDifference(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {

                map.put(s.charAt(i), 1);

            } else {

                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }


        }

        for (Map.Entry<Character, Integer> element : map.entrySet()) {
            if (element.getValue() % 2 == 0) {
                min = Math.min(min, element.getValue());
            }
            if (element.getValue() % 2 != 0) {
                max = Math.max(max, element.getValue());
            }
        }

        return max - min;
    }
}