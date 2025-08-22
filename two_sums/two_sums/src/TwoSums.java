import java.util.ArrayList;
import java.util.List;

public class TwoSums {
    private final int[] sortArray;
    private final int sum;

    public TwoSums(int[] sortArray, int sum) {
        this.sortArray = sortArray;
        this.sum = sum;
    }

    public List<Integer> findTwoNumber() {
        List<Integer> numbers = new ArrayList<>();
        if (sortArray.length == 0 || sortArray[0] > sum) {
            return numbers;
        }
        int number1 = 0;
        int number2 = 0;
        boolean found = false;

        for (int i = 0; i < sortArray.length; i++) {
            number1 = sortArray[i];
            for (int j = i + 1; j < sortArray.length; j++) {
                if (sortArray[j] == sum - number1) {
                    number2 = sortArray[j];
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (number1 + number2 == sum) {
            numbers.add(number1);
            numbers.add(number2);
        }
        return numbers;
    }

    public void printAnswer(List<Integer> array) {
        if (array.isEmpty()) {
            System.out.println("There are no such numbers in this array.");
        } else {
            System.out.printf("%d + %d = %d%n", array.get(0), array.get(1), sum);
        }
    }
}
