package lesson110;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Check checkeble = (x, y) -> x.length() >= y.length() ? x : y;


        System.out.println(checkeble.checking("sdasd","sadasdwefw"));
    }
}

@FunctionalInterface
interface Check {
   String checking(String x, String y);
}
