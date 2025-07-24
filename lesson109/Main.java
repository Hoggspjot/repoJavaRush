package lesson109;

public class Main{
    public static void main(String[] args) {

      Check delitel = x -> x % 13 == 0;

      int x = 120;

        System.out.println(delitel.check(x));


    }
}
@FunctionalInterface
interface Check {
    boolean check(int x);
}


