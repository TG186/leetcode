import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < length - 2; i++) {
            while(i > 0 && nums[i - 1] == nums[i] && i < length -2) {
                i++;
                continue;
            }

            int head = i + 1;
            int tail = length - 1;

            while( head != tail) {
                int sum = nums[i] + nums[head] + nums[tail];
                if (sum == 0) {
                    List<Integer> curResult = new ArrayList<>();
                    curResult.add(nums[i]);
                    curResult.add(nums[head]);
                    curResult.add(nums[tail]);
                    result.add(curResult);
                }
                if (sum > 0) {
                    tail--;
                    while(nums[tail + 1] == nums[tail]) {
                        if (tail - head == 0) {
                            break;
                        }

                        tail--;
                    }
                } else {
                    head++;
                    while (nums[head - 1] == nums[head]) {
                        if (tail - head == 0) {
                            break;
                        }
                        head++;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
//        int[] arr = {-1, 0, 1, 2, -1, -4};
//        Solution solution = new Solution();
//        List<List<Integer>> result = solution.threeSum(arr);
//        System.out.println(result);
        int[] arr = {0,0,0,0};
        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(arr);
        System.out.println(result);
    }
}