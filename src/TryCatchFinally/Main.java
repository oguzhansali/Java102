package TryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program başladı.");
        Scanner input = new Scanner(System.in);

        int a=1;
        int b=10;
        int c;
        int []arr=new int[2];

        try {//Hata alınmıyacak kısımalrı try catch içinde kullanmak gereksiz masraf oluşturur.
            System.out.println("Bölme İşlemi.");
            System.out.println(b/a);
            System.out.println("Bölme işlemi bitti.");
            System.out.println("Bir değer giriniz.");
            c=input.nextInt();
            arr[10]=11;
        }catch (ArithmeticException e){//Hatayı gösterir./Tek bit Exception e ile butun hataaları tanımlayabıliriz.
            System.out.println("Aritmetik  hata alındı.");
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){//MiSMATCH HATASI ALINDI.
            System.out.println("Yanlış veri girildi.");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Bu kısım kesinlikle çalışacak.");
        }

        System.out.println("Program bitti.");

    }


}
