package lesson108;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        String[] array1 = {"мама", "мыла", "раму"};
        String[] array2 = {"я", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд", "май"};

        List<String[]> listArr = new ArrayList<>();
        listArr.add(array1);
        listArr.add(array2);
        listArr.add(array3);

        listArr.sort(Comparator.comparingInt(o -> o.length));

        Thread thread = new Thread(() -> System.out.println("Hello world"));
        thread.start();


    }
}
