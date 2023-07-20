class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums[0] == nums[1]){
            return true;
        }
        else if (nums[0] == nums[nums.length - 1]){
            return true;
        }

        int j = 1;
        for (int i = 0; i<nums.length; i++){
            if (j == nums.length){
                break;
            }
            if(nums[i] == nums[j]){
                return true;
            }
            j++;
        }
        return false;

    }
}