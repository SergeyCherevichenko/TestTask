public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Main \"1,2,3,4\" targetSum");
            return;
        }

        try {
            String[] parts = args[0].split(",");
            int[] sortArray = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                sortArray[i] = Integer.parseInt(parts[i].trim());
            }

            int targetSum = Integer.parseInt(args[1]);

            TwoSums solver = new TwoSums(sortArray, targetSum);
            var result = solver.findTwoNumber();
            solver.printAnswer(result);

        } catch (NumberFormatException e) {
            System.out.println("Error: please provide integers only.");
        }
    }
}
