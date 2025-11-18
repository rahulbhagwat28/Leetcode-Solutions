class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        HashSet<Character> set = new HashSet<>();
        boolean flag = true;
        int count = 0;

        for (char c : allowed.toCharArray()) {
            set.add(c);
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (!(set.contains(words[i].charAt(j)))) {

                    flag = false;
                    break;
                } else {
                    flag = true;
                }

            }
            if (flag == true) {
                System.out.println(words[i]);
                count += 1;
            }

        }

        return count;
    }
}