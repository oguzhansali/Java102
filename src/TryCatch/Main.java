package TryCatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[]arr={0,1,2,3,4,5,7,8,9,10};
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Bir sayı seçiniz: ");
            int indis= input.nextInt();
            System.out.println("Listenin "+ indis + ". elamanı " +arr[indis]+"dir.");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("--------------------");
            System.out.println("Hata yakalandı.");
            System.out.println(e.getMessage());
            System.out.println();
        }
        System.out.println("Program sonlandırıldı.");
    }
}
