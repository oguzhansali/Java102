package Throw;

import java.util.Scanner;

public class Main {
    public static void checkAge(int age) throws AgeCheckException {
        if (age<18){
            throw new AgeCheckException("Yaş hatası alındı!");
        }
        System.out.println("Yaşınız tutuyor.");
    }

    public static void main(String[] args) throws AgeCheckException {
        Scanner input =new Scanner(System.in);
        System.out.println("Yaşınızı giriniz: ");
        int age = input.nextInt();
        try{
            checkAge(age);
        }catch (AgeCheckException e){
            System.out.println(e.toString());
        }


        System.out.println("Program sonlandırıldı.");



    }
}
