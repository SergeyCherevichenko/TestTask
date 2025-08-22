import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {
    private final String str;
    private final int n;

    public WordCounter(String str, int n){
        this.str = str;
        this.n = n;
    }

    public List<String> getWordCounterByN(){
        List<String> result = new ArrayList<>();
    Map<String, Integer> check = new HashMap<>();
    if(str == null || str.isBlank()){
        return result;
    }
    String []array = str.split(" ");
    for(String word : array){
        check.put(word,check.getOrDefault(word,0) + 1);
    }

    for (Map.Entry<String, Integer> entry : check.entrySet()) {
      if (entry.getValue() == n) {
        result.add(entry.getKey());
      }
            }
    return result;

        }

    public void printString(List<String> str1){
        if (str1.isEmpty()) {
            if (str == null || str.isBlank()) {
                System.out.println("Input string is empty.");
            } else {
                System.out.println("No words found with the given count.");
            }
            return;
        }

        for (String s : str1) {
            System.out.print(s + " ");
        }
    }

}
