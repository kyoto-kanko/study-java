import java.util.Arrays;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        words.stream()
        .filter(str -> str.length() >= 4)
        .forEach(str -> System.out.println(str));
    }
}
