import java.util.Optional;

public class Problem2 {
    public static void main(String[] args) {
        Optional<String> maybeString = getString();
        maybeString.ifPresent(System.out::println);

    }

    public static Optional<String> getString() {
        return Optional.of("Hello, Optional!");
    }
}
