class UniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {
            String result = "";
            String[] split = emails[i].split("@");

            int j = 0;

            while (j < split[0].length() && split[0].charAt(j) != '+') {
                if (split[0].charAt(j) != '.') {
                    result = result + split[0].charAt(j);

                }
                j++;
            }
            set.add(result + '@' + split[1]);
        }
        return set.size();
    }
}