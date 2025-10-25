class isSubsequence {
    public boolean isSubsequence(String s, String t) {

        char[] sarray=s.toCharArray();
        char[] tarray=t.toCharArray();

        int j=0;

        if(sarray.length==0) return true;

        for(int i=0;i<tarray.length;i++)
        {
            if(j!=sarray.length && sarray[j]==tarray[i])
            {
                j++;
            }

        }

        return j==sarray.length;

    }
}