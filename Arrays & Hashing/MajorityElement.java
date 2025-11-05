class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(!(map.containsKey(nums[i])))
            {
                map.put(nums[i],1);
            }
            else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {


            if(mapElement.getValue() > nums.length/2)
            {
                return  mapElement.getKey();
            }

        }
        return 0;
    }
}