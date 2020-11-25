package algorithm;

/**
 * 给定一个整数数组 nums和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums={3,3};
        twoSum (nums,6);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            int sub=target-nums[i];
            for (int i1 = i+1; i1 < n; i1++) {
                if (nums[i1]==sub){
                    res[0]=i;
                    res[1]=i1;
                }
            }
        }
        for (int re : res) {
            System.out.println (re);
        }
        return res;
        }
}

