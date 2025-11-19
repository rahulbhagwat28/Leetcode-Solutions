class Solution {
    public int countCharacters(String[] words, String chars) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        int count = 0;

        boolean flag = true;

        for (int i = 0; i < chars.length(); i++) {
            if (!map1.containsKey(chars.charAt(i))) {
                map1.put(chars.charAt(i), 1);
            } else {
                map1.put(chars.charAt(i), map1.get(chars.charAt(i)) + 1);
            }
        }

        for (int j = 0; j < words.length; j++) {
            for (int k = 0; k < words[j].length(); k++) {
                if (map1.containsKey(words[j].charAt(k))) {
                    if (!map2.containsKey(words[j].charAt(k))) {
                        map2.put(words[j].charAt(k), 1);
                    } else {
                        map2.put(words[j].charAt(k), map2.get(words[j].charAt(k)) + 1);
                    }
                    if (map2.get(words[j].charAt(k)) <= map1.get(words[j].charAt(k))) {
                        flag = true;
                    } else {
                        flag = false;
                        break;

                    }
                } else {
                    flag = false;
                    break;
                }

            }
            if (flag == true) {
                count = count + words[j].length();
            }

            map2.clear();
        }

        return count;

    }
}