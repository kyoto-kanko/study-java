import java.util.Optional;

public class Problem1 {
    public static Optional<String> convertToUppercase(String input) {
        return Optional.ofNullable(input).map(String::toUpperCase);
    }
    public static void main(String[] args) {
        System.out.println(convertToUppercase(null));
    }
}
