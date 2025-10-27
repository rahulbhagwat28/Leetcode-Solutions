class StringScore {
    public int scoreOfString(String s) {

        char[] sarray=s.toCharArray();
        int sum=0;

        for(int i=0;i<sarray.length-1;i++)
        {
            sum=sum+Math.abs((int) sarray[i]-(int) sarray[i+1]);

        }
        return sum;
    }
}