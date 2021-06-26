class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{0,0};
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int x=0; x<nums.length; x++){
            if (hm.containsKey(nums[x])){
                return new int[]{hm.get(nums[x]),x};
            }
            hm.put(target-nums[x],x);
        }
        return new int[]{0,0};
    }
}