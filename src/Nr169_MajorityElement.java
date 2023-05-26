public class Nr169_MajorityElement {
    public int majorityElement(int[] nums) {
        quicksort(nums, 0, nums.length-1);
        return nums[nums.length/2];
    }
    private void quicksort(int[] nums, int low, int high) {
        int i = low;
        int j = high;
        int pivot = nums[low+(high-low)/2];
        while (i<=j) {
            while (nums[i]<pivot) i++;
            while (nums[j]>pivot) j--;
            if (i<=j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        if (low<j) quicksort(nums, low, j);
        if (i<high) quicksort(nums, i, high);
    }
}
