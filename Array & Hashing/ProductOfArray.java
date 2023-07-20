public class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];
        if (nums.length<1) return ans;

        int product = 1;
        for (int i = 0; i<nums.length; i++){
            product *= nums[i];
            ans[i] = product;
        }
        product = 1;
        for (int i=nums.length-1; i>0; i--){
            ans[i] = ans[i-1] * product;
            product *= nums[i];
        }
        ans[0] = product;
        return ans;

    }
}
