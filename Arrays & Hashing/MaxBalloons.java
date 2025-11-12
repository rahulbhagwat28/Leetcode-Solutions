class Solution {
    public int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        need.put('b', 1);
        need.put('a', 1);
        need.put('l', 2);
        need.put('o', 2);
        need.put('n', 1);

        int count = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < text.length(); i++) {
            if (!have.containsKey(text.charAt(i))) {
                have.put(text.charAt(i), 1);
            } else {
                have.put(text.charAt(i), have.get(text.charAt(i)) + 1);
            }
        }


        for (Map.Entry<Character, Integer> element : need.entrySet()) {
            if (have.containsKey(element.getKey())) {
                min = Math.min(min, (have.get(element.getKey()) / element.getValue()));
            } else {
                return 0;
            }
        }


        return min;
    }
}