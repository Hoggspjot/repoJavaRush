package lesson111;

public class Main {
    public static void main(String[] args) {

        Check checkable = ((x, y, z) -> Math.pow(y, 2) - 4 * x * z);

        System.out.println(checkable.check(23.75,23.7,54.5));


        Check check2 = ((x, y, z) -> x * Math.pow(y, z));
        System.out.println(check2.check(2.0,3.0, 4.0));

    }
}


interface Check {
    double check(double x, double y, double z);
}
