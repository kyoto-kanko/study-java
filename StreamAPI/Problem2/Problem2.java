import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);
        Double ans = numbers.stream()
        .filter(num -> num % 2 == 0 && num > 5)
        .mapToInt(Integer::intValue)
        .average()
        .getAsDouble();

        System.out.println(ans);
    }
}
