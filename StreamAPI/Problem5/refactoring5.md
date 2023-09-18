# Problem5
## 問題文
以下の配列から、名前が5文字以上の人をフィルタリングして、その名前を大文字に変換し、最終的にSetとして取得してください。

```java
String[] namesArray = {"John", "Alexandra", "Mike", "Elizabeth", "Victoria", "Richard"};
```

## 提出した回答
```java
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import java.util.stream.Collectors;

public class Problem5 {
    public static void main(String[] args) {
        String[] namesArray = {"John", "Alexandra", "Mike", "Elizabeth", "Victoria", "Richard"};
        Set<String> ans =  Arrays.stream(namesArray)
        .filter(name -> name.length() >= 5)
        .map(name -> name.toUpperCase())
        .collect(Collectors.toSet());
        System.out.println(ans);
    }
}
```
## ChatGPTからの回答
提出されたコードは正確です。以下のステップを実行して、名前が5文字以上のものを大文字に変換し、最後に`Set`として結果を取得しています。

1. 配列からストリームを生成する: `Arrays.stream(namesArray)`
2. 名前の長さが5以上のものをフィルタリング: `.filter(name -> name.length() >= 5)`
3. 名前を大文字に変換: `.map(name -> name.toUpperCase())`
4. ストリームの結果を`Set`に収集: `.collect(Collectors.toSet())`

指摘としては、コメントや不要なインポート文を除去することで、さらに簡潔にすることができます。

```java
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Problem5 {
    public static void main(String[] args) {
        String[] namesArray = {"John", "Alexandra", "Mike", "Elizabeth", "Victoria", "Richard"};
        Set<String> ans = Arrays.stream(namesArray)
                            .filter(name -> name.length() >= 5)
                            .map(String::toUpperCase)
                            .collect(Collectors.toSet());
        System.out.println(ans);
    }
}
```

ここで、`name -> name.toUpperCase()`を`String::toUpperCase`に置き換えて、メソッド参照を使用しました。
