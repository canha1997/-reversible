package Easythuannghich;

import java.lang.reflect.Array;
import java.util.*;



/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap chuoi se duoc kiem tra");
        String a = scanner.nextLine();
        char[] charArray = a.toCharArray();
        testThuanNghich(charArray);


    }

    public static void testThuanNghich(char[] charArray) {
        int j = charArray.length;
        char[] test = new char[j];
        for (int i = 0; i < charArray.length; i++) {
            test[j - 1] = charArray[i];
            j = j - 1;

        }
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
        String test1 = String.copyValueOf(charArray);
        String test2 = String.copyValueOf(test);
        if (test1.equals(test2)) {
            System.out.println("La chuoi thuan nghich");
        }
        else {
            System.out.println("Khong phai la mot chuoi thuan nghich");
        }


    }
}

