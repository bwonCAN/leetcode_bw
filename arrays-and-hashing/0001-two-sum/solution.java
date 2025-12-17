class Solution {
    public int[] twoSum(int[] nums, int target) {
        // num[i] + num[j] == target
        // we need figure out which two numbers make up the target, and store their index
        // Hashmap -> Key, Value
        // Key: remainder = target - num[i]; why? well is the value we need for num[i];
        // for example: if num[i] = 3, res = 4; if num[j] = 4, then we know we have an answer
        // this is how we're checking target and the remainder 
        // Value: index
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (map.containsKey(nums[i])) {
                // have solution, we need to get it in lowest index first
                res[0] = map.get(nums[i]); 
                res[1] = i;
            } else {
                map.put(remainder, i);
            }
        }
        return res;
    }
}
