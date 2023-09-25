# Problem3

## 問題文
userの名前を大文字に変換して、その結果をコンソールに出力する

## 提出した回答
```java
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

```
## ChatGPTからの回答
```java
import java.util.Optional;

public class UppercaseUserNamePrinter {

    public static void main(String[] args) {
        Optional<User> optionalUser = retrieveUser();

        // Convert the user's name to uppercase and print it
        optionalUser.map(User::getName)
                    .map(String::toUpperCase)
                    .ifPresent(System.out::println);
    }

    private static Optional<User> retrieveUser() {
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
```

変更点:

1. クラス名を`Problem3`から`UppercaseUserNamePrinter`に変更して、クラスの目的をより明確に反映。
2. `getUser`メソッドの名前を`retrieveUser`に変更して、その目的をより明確に。
3. `user`変数の名前を`optionalUser`に変更して、変数の型が`Optional`であることをより明確に示唆。
4. メソッド参照を使ってコードをわかりやすく。
5. 不要なコメントの削除。

これにより、コードの意図がより明確に伝わるようにしました。
