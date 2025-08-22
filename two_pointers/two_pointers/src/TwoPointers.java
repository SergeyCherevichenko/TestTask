public class TwoPointers {
    private final int[] nums;

    public TwoPointers(int[] nums) {
        this.nums = nums;
    }

    public int removeDuplicates() {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public void printArray(int newLength) {
        System.out.print("[");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
            if (i < newLength - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
