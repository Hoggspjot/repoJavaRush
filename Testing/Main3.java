package Testing;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main3 {
    public static void main(String[] args) {

        boolean flag;
        try (Scanner scanner = new Scanner(System.in)) {
            int x;
            while (true) {
                System.out.println("Введи число ");
                if (scanner.hasNextInt()) {
                    x = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка! Введи число ");
                    scanner.nextLine();
                }
            }
            flag = x > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(x)).noneMatch(i -> x % i == 0);
            System.out.println("Число "+ x +  " простое ? - " + flag);
        }

    }
}
