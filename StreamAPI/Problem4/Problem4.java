import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int ans = numbers.stream()
        .filter(num -> num % 2 == 0)
        .mapToInt(even -> even * even)
        .sum();
        System.out.println(ans);
    }
}
