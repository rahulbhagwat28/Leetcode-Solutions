class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> subs = new ArrayList<>();


        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].indexOf(words[j]) >= 0) {
                    if (!subs.contains(words[j])) {
                        subs.add(words[j]);
                    }
                }
                if (words[j].indexOf(words[i]) >= 0) {
                    if (!subs.contains(words[i])) {
                        subs.add(words[i]);
                    }
                }
            }

        }
        return subs;
    }
}