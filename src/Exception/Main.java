package Exception;

import java.util.Scanner;

public class Main {

    Scanner input = new Scanner(System.in);
    /*
    public static void main(String[] args) {

        System.out.print("A değerini giriniz.");
        int a = input.nextInt();
        int b = 10;
        int equles=b/a;
        if (a == 0) {
            System.out.println("Bir sayı sıfıra bölünemez.");
        } else {
            System.out.println(equles);
        }
        System.out.println("Program bitti.");
    }

     */

    public static void connectTCMB(){
        System.out.println("Merkez Bankasının kurlarına erişiliyor.");
    }

    public static void main(String[] args) {
        connectTCMB();
    }
}
