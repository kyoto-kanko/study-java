# Problem1
## 問題文
// リストList<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry"); から、
// 4文字以上の単語だけを取り出して新しいリストとして返してください。

## 提出した回答

```java
public class Problem1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        words.stream()
        .filter(str -> str.length() >= 4)
        .forEach(str -> System.out.println(str));
    }
}
```
## ChatGPTからの回答
1. **インポート文の追加：ListやArraysのクラスを使用するには、適切なインポート文が必要です。**
1. **System.out::println の利用：メソッド参照を使用してコードを簡潔にすることができます。**

```java
public class Problem1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        words.stream()
        .filter(str -> str.length() >= 4)
        .forEach(System.out::println);
    }
}
```
