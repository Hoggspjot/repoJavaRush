package lesson103;

/* 
Восьмеричный конвертер
*/

public class Solution1031 {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if(decimalNumber <= 0){
            return 0;
        }
        int i = 0;
        int x = 0;
        while ( decimalNumber != 0) {
           x = (int) (x + (decimalNumber % 8) * Math.pow(10, i));
           decimalNumber = decimalNumber / 8;
           i++;
        }
        //напишите тут ваш код
        return x;
    }

    public static int toDecimal(int octalNumber) {
        if(octalNumber <= 0){
            return 0;
        }
        int i = 0;
        int x = 0;
        while (octalNumber != 0) {
            x = (int) (x + (octalNumber % 10) * Math.pow(8, i));
            octalNumber = octalNumber / 10;
            i++;
        }
        //напишите тут ваш код
        return x;
    }
}
