class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int myarray[] = new int[grid.length * grid.length];
        int count = 0;
        int rescount = 0;

        int missing = 0;
        int duplicate = 0;
        HashSet<Integer> dups = new HashSet<>();


        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {

                myarray[count] = grid[i][j];
                count++;
            }
        }

        for (int i = 0; i < myarray.length; i++) {
            int index = Math.abs(myarray[i]) - 1;
            if (myarray[index] >= 0) {
                myarray[index] = myarray[index] * -1;
            }
        }

        System.out.println(Arrays.toString(myarray));


        for (int k = 0; k < myarray.length; k++) {
            int myval = Math.abs(myarray[k]);


            if (myarray[k] >= 0) {

                missing = k + 1;
            }

            if (dups.add(myval) == false) {

                duplicate = myval;
            }

        }

        return new int[]{duplicate, missing};
    }
}