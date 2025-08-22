import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.println("Enter string: ");
    String str = scan.nextLine();
    System.out.println("Enter number of matches: ");
    int n = 0;
    boolean isCorrect = true;
    while(isCorrect){
    try {
      n = scan.nextInt();
      isCorrect = false;
    } catch (InputMismatchException e){
        System.out.println("You not enter number. Please tree again:");
        scan.nextLine();

    }
    }
    WordCounter wordCounter = new WordCounter(str,n);
    wordCounter.printString(wordCounter.getWordCounterByN());
}
}