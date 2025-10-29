class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result=new ArrayList<>();

        result.add(List.of(1));

        for(int i=1;i<numRows;i++)
        {
            List<Integer> previous=result.get(i-1);
            List<Integer> rowdata=new ArrayList<>();

            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    rowdata.add(1);
                }
                else {
                    rowdata.add(previous.get(j-1)+previous.get(j));
                }
            }

            result.add(rowdata);
        }

        return result;
    }
}