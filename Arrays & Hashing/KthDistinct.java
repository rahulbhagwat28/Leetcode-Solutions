class Solution {
    public String kthDistinct(String[] arr, int k) {


        Map<String, Integer> map = new LinkedHashMap<>();
        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for (Map.Entry<String, Integer> element : map.entrySet()) {
            if (element.getValue() == 1) {
                count++;


            }
            if (count == k) return element.getKey();
        }


        return "";
    }
}