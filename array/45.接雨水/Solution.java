   /**
     * ±©Á¦ .
     * @param height
     * @return
     */
    public int trap(int[] height) {

        int sum = 0;
        int length = height.length;
        for (int i = 0; i < height.length; i++) {
            int max_left = 0;
            int max_right = 0;
            for (int j = i; j >= 0; j--) {
                max_left = Math.max(height[j], max_left);
            }

            for (int j = i; j < length; j++) {
                max_right = Math.max(height[j], max_right);
            }

            sum += Math.min(max_left, max_right) - height[i];
        }
        return sum;
    }

    /**
     * Ë«Ö¸Õë .
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int sum = 0;
        int length = height.length;
        int left = 0; int right = length - 1;
        int leftMax = 0; int rightMax = 0;

        while(left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(height[left], leftMax);
                sum += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(height[right], rightMax);
                sum += rightMax - height[right];
                right--;
            }
        }
        return sum;
    }