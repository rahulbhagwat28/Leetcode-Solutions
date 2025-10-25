class ReplaceElement {
    public int[] replaceElements(int[] arr) {

        arr[0]=0;
        arr[arr.length-1]=-1;

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<=arr.length-1;j++)
            {
                if(arr[j]>arr[i])
                {
                    arr[i]=arr[j];
                }
            }
            arr[i+1]=0;
        }




        return arr;

    }
}