package newStudy;

import java.nio.file.Files;
import java.util.*;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        System.out.println(Optional.of(1));
        StringBuilder sb = new StringBuilder("Start ");

        TreeMap<Integer,Integer> tree = new TreeMap<>();

        tree.put(1, 100);
        tree.put(5, 500);

        System.out.println(tree.ceilingEntry(2));
        System.out.println(tree.floorEntry(2));

    }
}


