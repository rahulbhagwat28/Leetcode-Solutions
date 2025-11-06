//Brute Force Solution

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {


        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[nums1.length];
        int count = 0;


        for (int i = 0; i < nums2.length; i++) {
            int max = -1;
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]) {
                    max = nums2[j];
                    break;
                }

            }

            map.put(nums2[i], max);

        }

        map.put(nums2[nums2.length - 1], -1);

        for (int k = 0; k < nums1.length; k++) {
            result[count] = map.get(nums1[k]);
            count++;
        }

        return result;
    }
}

//Monotonic Stack -Decreasing

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {


        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[nums1.length];
        Stack<Integer> mystack = new Stack<Integer>();

        int count = 0;

        for (int i = 0; i < nums2.length; i++) {
            if (mystack.isEmpty() || nums2[i] < mystack.peek()) {
                mystack.push(nums2[i]);
            } else {
                while (!mystack.isEmpty() && nums2[i] > mystack.peek()) {
                    map.put(mystack.pop(), nums2[i]);


                }
                mystack.push(nums2[i]);
            }
        }


        for (int j = 0; j < nums1.length; j++) {
            if (!map.containsKey(nums1[j])) {
                result[count] = -1;
            } else {
                result[count] = map.get(nums1[j]);
            }
            count++;
        }


        return result;

    }
}