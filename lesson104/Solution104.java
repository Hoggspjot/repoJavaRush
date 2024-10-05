

/* 
Двоичный конвертер
*/

public class Solution104 {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <=0) {
            return "";
        }
        int x = 0;
        String str ="";
        while (decimalNumber != 0){
            x = (decimalNumber % 2) + x;
            str = x + str;
            x = 0;
            decimalNumber = decimalNumber / 2;
        }

        return str;
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber.equals(null) || binaryNumber.equals("")){
            return 0;
        }
        int y = binaryNumber.length();
        int x = 0;
        for (int i = 0; i < y; i++) {
            String strNum = binaryNumber.substring(i, i+1);
            int a = Integer.parseInt (strNum);
            x = (int) (x + a * Math.pow(2, i));
        }
        return x;
    }
}
