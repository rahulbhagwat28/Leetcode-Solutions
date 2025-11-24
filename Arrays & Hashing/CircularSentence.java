class Solution {
    public boolean isCircularSentence(String sentence) {

        boolean flag = true;

        if (sentence.length() == 1) {
            return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
        }

        String[] sen = sentence.split(" ");

        for (int i = 0; i < sen.length - 1; i++) {
            String prev = sen[i];
            String next = sen[i + 1];

            flag = prev.charAt(prev.length() - 1) == next.charAt(0);


            if (flag == false) {
                return flag;
            }
        }

        if (flag == true)
            return sen[0].charAt(0) == sen[sen.length - 1].charAt(sen[sen.length - 1].length() - 1);

        return true;

    }
}