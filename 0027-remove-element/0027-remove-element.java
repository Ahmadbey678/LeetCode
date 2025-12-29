class Solution {
    public int removeElement(int[] nums, int val) {
        
        int c_val = 0;
        int c_k = 0;

        int i = 0;

        while(i<nums.length){

            if(nums[i] == val){

                c_val += 1;

            }

            else{

                c_k += 1;

                nums[i - c_val] = nums[i];
            }

            i++;
        }

        return c_k;
    }
}