import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");
        List<String> ans = words.stream()
        .filter(w -> w.length() >= 5)
        .map(w -> w.toUpperCase())
        .collect(Collectors.toList());

        System.out.println(ans);
    }
}
