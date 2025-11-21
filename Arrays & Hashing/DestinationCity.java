class Solution {
    public String destCity(List<List<String>> paths) {

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < paths.size(); i++) {
            List<String> rs1 = paths.get(i);

            map.put(rs1.get(0), rs1.get(1));

        }

        for (Map.Entry<String, String> element : map.entrySet()) {
            if (!map.containsKey(element.getValue())) {
                return element.getValue();
            }
        }

        return "";
    }
}