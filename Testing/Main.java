package Testing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        char[] strings = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            strings[i] = str.charAt(i);
        }

        int count = 0;
        char[] chars = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if(strings[i] == chars[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println("Количество гласных: " + count);
    }
}
