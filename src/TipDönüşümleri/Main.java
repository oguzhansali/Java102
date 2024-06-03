package TipDönüşümleri;

public class Main {
    public static void main(String[] args) {
        /*
        //Widening Casting(Otomatik)
        int a = 10;
        double b=a;
        System.out.println(b);*/

        /*
        ///Narrowing Casting(Manuel)
        double pi=3.14;
        int a = (int)pi;
        System.out.println(a);

        byte c =80;
        System.out.println((char) c);*/

        //Integer=> String

        int a = 20;
        System.out.println("Integer:" + a);

        String str=String.valueOf(a);
        System.out.println(str);

        int b = Integer.parseInt(str);
        System.out.println(b+a);

    }
}
