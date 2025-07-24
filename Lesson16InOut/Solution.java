package Lesson16InOut;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
Перепутанные байты
*/

public class Solution {

    public static String src;
    public static String dest;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        src = sc.nextLine();
        dest = sc.nextLine();

        try(FileInputStream input = new FileInputStream(src);
        FileOutputStream output = new FileOutputStream(dest))
        {
            byte[] buffer = new byte[65536];
            while (input.available() > 0){
                int real = input.read(buffer);
                output.write(buffer, 0,real);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }

