package Testing;

import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {

        List<String> list = List.of("Привет","как", "дела?");

        List<String> newList = list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
        System.out.println(newList);
    }
}
