class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return 1;
        }
        int i = 0;
        for (int j = 0; j < length; j++) {
            if (j < length - 1  && nums[j] != nums[j + 1]) {
                nums[i] = nums[j];
                i++;
            }

            if (j < length - 1 && nums[j] == nums[j + 1]){
                nums[i] = nums[j];
                while(j < length - 1 && nums[i] == nums[j + 1]) {
                    j++;
                }
                i++;
            }

            if (j == length - 1 && nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
            }
            if (j == 0 && nums[j] == nums[j+1]) {
                nums[i] = nums[j];
                i++;
                j++;
            }
        }
        return i;
    }
}