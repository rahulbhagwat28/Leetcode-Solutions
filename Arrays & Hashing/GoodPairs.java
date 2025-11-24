
//Brute force approach
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(i<j && nums[i]==nums[j])
                {
                    count++;
                }
            }
        }

        return count;
    }
}


//Hashmap solution
class Solution {
    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                count=count+map.get(nums[i]);
            }

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        return count;
    }
}