import java.util.Optional;

public class Problem3 {

    public static void main(String[] args) {
        Optional<User> user = getUser();

        user.map(i -> i.getName().toUpperCase()).ifPresent(System.out::println);
    }

    public static Optional<User> getUser() {
        return Optional.of(new User("John"));
    }
}

class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
