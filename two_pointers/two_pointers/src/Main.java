public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main \"1,1,1,2,2,3,3,3,3\"");
            return;
        }


        String[] parts = args[0].split(",");
        int[] nums = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            try {
                nums[i] = Integer.parseInt(parts[i].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + parts[i]);
                return;
            }
        }

        TwoPointers twoPointers = new TwoPointers(nums);
        int newLength = twoPointers.removeDuplicates();
        twoPointers.printArray(newLength);
    }
}
