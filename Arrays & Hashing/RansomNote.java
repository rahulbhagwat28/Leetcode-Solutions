class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        boolean flag = true;

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            map1.put(ransomNote.charAt(i), map1.getOrDefault(ransomNote.charAt(i), 0) + 1);

            if (map.containsKey(ransomNote.charAt(i)) &&
                    map1.get(ransomNote.charAt(i)) <= map.get(ransomNote.charAt(i))) {
                flag = true;

            } else {
                flag = false;
                break;
            }

        }

        return flag;
    }
}