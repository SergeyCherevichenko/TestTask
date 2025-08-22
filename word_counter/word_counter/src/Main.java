public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: please provide a string and a number as arguments.");
            System.out.println("Example: java Main \"hello world hello\" 2");
            return;
        }

        String str = args[0];
        int n;

        try {
            n = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Error: second argument must be an integer.");
            return;
        }

        WordCounter wordCounter = new WordCounter(str, n);
        wordCounter.printString(wordCounter.getWordCounterByN());
    }
}
