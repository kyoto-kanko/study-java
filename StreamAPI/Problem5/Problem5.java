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
