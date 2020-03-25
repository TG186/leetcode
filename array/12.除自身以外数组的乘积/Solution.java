class Solution {
    public int[] productExceptSelf(int[] nums) {
        final int length = nums.length;
        int[] leftArr = new int[length];
        int[] rightArr = new int[length];
        int[] resultArr = new int[length];
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                leftArr[i] = leftArr[i - 1] * nums[i];
                rightArr[i] = rightArr[i - 1] * nums[length - i -1];
            } else {
                leftArr[i] = nums[i];
                rightArr[i] = nums[length - 1];
            }
        }
        resultArr[0] = rightArr[length - 2];
        resultArr[length - 1] = leftArr[length  - 2];
        for (int i = 1; i < length - 1; i++) {
            int left = leftArr[i - 1];
            int right = rightArr[length - i - 2];
            resultArr[i] = left * right;
        }
        return resultArr;
    }
}