
/*
Двоично-шестнадцатеричный конвертер
*/

public class Solution106 {
    private static final String HEX = "0123456789abcdef";
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String HEX = "0123456789abcdef";
        String hexNum = "";
        char chStr = '0';
        if (binaryNumber == null || (binaryNumber.trim().isEmpty())) {
            return "";
        }
        int dl = binaryNumber.length();
        String strFin = "";
        if(dl % 4 != 0) {
            while (dl % 4 != 0)
                binaryNumber = "0" + binaryNumber;
        }
        for (int i = 0; i < dl; i+=4) {
            String str = binaryNumber.substring(dl - (dl - i), dl - 8 + i);
            strFin= str;
            int y = strFin.length();
            int x = 0;
            for (int j = 0; j < y; j++) {
                String strNum = strFin.substring(strFin.length() - (j +1), strFin.length() - j);
                int a = Integer.parseInt (strNum);
                x = (int) (x + a * Math.pow(2, j));
            }
            chStr = HEX.charAt(x);
            hexNum = hexNum + chStr;

        }
        return hexNum;
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || (hexNumber.trim().isEmpty())) {
            return "";
        }
        int x = 0;
        char str1 = '0';
        for (int i = 0; i < hexNumber.length(); i++) {
            str1 = hexNumber.charAt(i);
            int index = HEX.indexOf(str1);
            x = 16 * x + index;
        }
        int y = 0;
        String decimal = "";
        while (x != 0){
            y = (x % 2) + y;
            decimal = y + decimal;
            y = 0;
            x = x/2;
        }
        return decimal;
    }
    }




