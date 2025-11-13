class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] name = s.split(" ");
        char[] patterns = pattern.toCharArray();
        boolean flag = true;

        HashMap<String, Character> smap = new HashMap<>();
        HashMap<Character, String> patternmap = new HashMap<>();

        if (name.length != patterns.length)
            return false;

        for (int i = 0; i < patterns.length; i++) {

            if (!smap.containsKey(name[i])) {
                smap.put(name[i], patterns[i]);
            } else {
                if (smap.get(name[i]) != patterns[i]) {
                    return false;
                }

            }
            if (!patternmap.containsKey(patterns[i])) {
                patternmap.put(patterns[i], name[i]);
            } else {
                if (!patternmap.get(patterns[i]).equals(name[i])) {
                    return false;
                }

            }

        }
        return flag;

    }
}