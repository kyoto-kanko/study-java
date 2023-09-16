# Problem3
## 問題文
以下のリストに格納されている文字列から、文字数が5以上の文字列だけを大文字に変換して、新しいリストとして返すストリーム操作を実装してください。

```java
List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");
```

## 提出した回答
```java
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
```
## ChatGPTからの回答
以下のコードは、より簡潔に書き直されたものです。

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");
        List<String> ans = words.stream()
        .filter(w -> w.length() >= 5)
        .map(String::toUpperCase)
        .collect(Collectors.toList());

        System.out.println(ans);
    }
}
```

変更点は、`.map(w -> w.toUpperCase())` を `.map(String::toUpperCase)` に置き換えたことです。これにより、メソッド参照を使用してコードが少し簡潔になりました。
この変更により、少しですがコードの記述量が減少しました。
