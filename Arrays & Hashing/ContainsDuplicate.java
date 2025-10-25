class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set=new HashSet<Integer>();

        for(int i:nums)
        {
            if(set.add(i)==false)
            {
                return true;
            }
        }

        return false;
    }
}