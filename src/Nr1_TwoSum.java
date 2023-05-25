public class Nr1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] returned = new int[2];
        int[] index1 = new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            index1[i] = nums[i];
            for (int j=0;j<i;j++) {
                if (index1[j]+nums[i]==target) {
                    returned[0] = j;
                    returned[1] = i;
                }
            }
        }
        return returned;
    }
}
