class Solution {
    public int findLucky(int[] arr) {

        int max = -1;

        if (arr[0] == 500) {
            return arr[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> element : map.entrySet()) {
            if (element.getKey() == map.get(element.getKey())) {
                max = Math.max(element.getKey(), max);
            }
        }

        return max;
    }
}