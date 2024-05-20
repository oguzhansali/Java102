package TryCatch;

import java.util.Scanner;

public class Main {

    private static int[]arr={0,1,2,3,4,5,7,8,9,10};//Dizi manuel olarak tanımlandı.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı seçiniz: ");
        int indis= input.nextInt();
        System.out.println(checkArray(indis));//Hatanın ayıklandığı metot çağrıldı.
    }
    public static String checkArray(int indis){//Alınan değer için hata çıktısı oluşturuldu.

        try{
            int number = arr[indis];
            return "Listenin "+ indis + ". elamanı " +arr[indis]+"dir.";
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("--------------------");
            System.out.println("Hata yakalandı.");
            System.out.println(e.getMessage());
            System.out.println();
            return "0 ile 9 arasında bir değer giriniz.";

        }
        //System.out.println("Program sonlandırıldı.");
    }
}
