class Solution {
    /**
     * ÊäÈë£º[1,8,6,2,5,4,8,3,7]
     * Êä³ö£º49
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
       int head = 0;
       int tail = height.length - 1;
       int max = 0;
       while(head != tail) {
           max = Math.max(max, Math.min(height[head], height[tail]) * (tail - head) );
           if (height[head] > height[tail]) {
               tail--;
           } else {
               head++;
           }
       }
       return max;
    }
}