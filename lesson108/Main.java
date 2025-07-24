package lesson108;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] array1 = {"мама", "мыла", "раму"};
        String[] array2 = {"я", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд", "май"};

        List<String[]> listArr = new ArrayList<>();
        listArr.add(array1);
        listArr.add(array2);
        listArr.add(array3);

         Comparator<String[]> comparator = new Comparator<String[]>() {
             @Override
             public int compare(String[] o1, String[] o2) {
                 return o1.length - o2.length;
             }
         };

         Comparator<String[]> comparator1 = new Comparator<String[]>() {
             @Override
             public int compare(String[] o1, String[] o2) {
                 int count1 = 0;
                 int count2 = 0;
                 for (int i = 0; i < o1.length; i++) {
                     count1+=o1[i].length();
                 }
                 for (int i = 0; i < o2.length; i++) {
                     count2+=o2[i].length();
                 }
                 return count1 - count2;
             }
         };


        listArr.sort(comparator);
        print(listArr);
        System.out.println();
        listArr.sort(comparator1);
        print(listArr);



    }

    public static void print(List<String[]> list) {
        for (String[] s : list) {
            for (int i = 0; i < s.length; i++) {
                System.out.print(s[i]+" ");
            }
            System.out.println();
        }
    }
}
