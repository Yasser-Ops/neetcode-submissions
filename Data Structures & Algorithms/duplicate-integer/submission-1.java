class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int z = i + 1; z < nums.length; z++) { 
                if (nums[i] == nums[z]) { 
                    return true;
                }
            }
        }
        return false;
    }
}
