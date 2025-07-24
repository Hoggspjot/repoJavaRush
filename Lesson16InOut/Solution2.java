package Lesson16InOut;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.Files.*;


public class Solution2 {
    public static void main(String[] args) throws IOException {
        try (   Scanner sc = new Scanner(System.in);
                InputStream in = Files.newInputStream(Paths.get(sc.nextLine()));
                OutputStream out = new FileOutputStream(String.valueOf(Paths.get(sc.nextLine())))) {
            byte[] buffer = new byte[65536];
            while (in.available() > 0) {
                int real = in.read(buffer);
                out.write(buffer, 0, real);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

