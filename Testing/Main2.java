package Testing;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введи число: ");
            Integer x = scanner.nextInt();

            boolean flag = true;
            if (x <= 1) {
                flag = false;
            }

            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    flag = false;
                    break;
                }
            }
            System.out.println("Число " + x + " простое: " + flag);
        }
    }
}
