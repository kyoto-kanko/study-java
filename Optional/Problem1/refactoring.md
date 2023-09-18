## 問題文
`Problem1` クラスには、文字列を大文字に変換するメソッド `convertToUppercase` が定義されています。このメソッドは、入力が `null` の場合でも動作するように `Optional` を利用しています。このコードをリファクタリングしてください。

```java
import java.util.Optional;

public Optional<String> convertToUppercase(String input) {
    // TODO: 実装してください。
}
```

## 提出したコード
```java
public class Problem1 {
    public static Optional<String> convertToUppercase(String input) {
        return Optional.ofNullable(input).map(String::toUpperCase);
    }
    public static void main(String[] args) {
        System.out.println(convertToUppercase("test"));
    }
}
```

## ChatGPTからの回答
提出されたコードは既に簡潔で、`Optional` を適切に使用しています。しかし、細かい点での改善や明確化を考慮すると、以下のようにリファクタリングすることができます：

1. メソッド名や変数名をもう少し具体的にする。
2. 出力結果を見る際に、Optionalの状態をより明確にする。

```java
import java.util.Optional;

public class UppercaseConverter {

    public static Optional<String> toUppercase(String input) {
        return Optional.ofNullable(input).map(String::toUpperCase);
    }

    public static void main(String[] args) {
        Optional<String> result = toUppercase(null);

        if(result.isPresent()) {
            System.out.println("Converted string: " + result.get());
        } else {
            System.out.println("Input was null.");
        }
    }
}
```

上記のリファクタリングでは、以下の変更を行っています：

1. クラス名を `UppercaseConverter` に変更して、そのクラスの役割をより明確にしました。
2. メソッド名を `toUppercase` に変更して、行う操作をより明確にしました。
3. `main` メソッドで、結果が存在するかどうかを `isPresent()` でチェックし、結果の内容に応じて異なるメッセージを出力するようにしました。
