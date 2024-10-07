

/* 
Шестнадцатеричный конвертер
*/

public class Solution105 {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        }
        String str = "";
        int num = 0;
        while (decimalNumber != 0){
            num = decimalNumber % 16;
            str = HEX.substring(num,num +1) + str;
            decimalNumber = decimalNumber / 16;
        }
        return str;
    }


    public static int toDecimal(String hexNumber) {
        if (hexNumber == null || (hexNumber.trim().isEmpty())) {
            return 0;
        }
        int x = 0;
        char str = '0';
        for (int i = 0; i < hexNumber.length(); i++) {
            str = hexNumber.charAt(i);
            int index = HEX.indexOf(str);
            x = 16 * x + index;
        }
        return x;
    }
}