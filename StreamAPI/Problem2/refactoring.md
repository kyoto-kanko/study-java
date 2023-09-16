# Problem2

## 問題文
リストList<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9); から次の条件を満たす数値を取り出し、その平均値を求めてください。
- 条件:
    - 数値は偶数であること。
    - 数値は5より大きいこと。

## 提出した回答
```java
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
```

## ChatGPTからの回答
### .getAsDouble() は OptionalDouble が値を持っている場合にのみ使用するべき
もしフィルタリングによって一つも条件に合致する数値がない場合（例えば、リストが空であった場合や、すべての数値が条件を満たさなかった場合）に .getAsDouble() を呼び出すと、NoSuchElementException がスローされます。
そのため、セーフティーなコードを書く場合は、前回示したように .orElse() メソッドを使用して、値が存在しない場合のデフォルト値を指定することが推奨されます。

```java

public class Problem2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);

        double average = numbers.stream()
                                .filter(num -> num % 2 == 0 && num > 5)
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0.0);  // この行で、平均値が存在しない場合のデフォルト値を設定しています。

        System.out.println(average);
    }
}
```
