class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> list = new ArrayList<>();

        list.add(List.of(1));


        for (int i = 1; i <= rowIndex; i++) {

            List<Integer> prev = list.get(i - 1);
            List<Integer> mid = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    mid.add(1);
                } else {
                    mid.add(prev.get(j) + prev.get(j - 1));
                }
            }

            list.add(mid);
        }


        return list.get(rowIndex);

    }
}