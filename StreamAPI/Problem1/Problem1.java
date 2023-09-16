// 問題: 1
// リストList<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry"); から、
// 4文字以上の単語だけを取り出して新しいリストとして返してください。

import java.util.Arrays;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        words.stream()
        .filter(str -> str.length() >= 4)
        .forEach(str -> System.out.println(str));
    }
}
