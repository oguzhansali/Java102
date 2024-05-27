package AutoBoxingUnboxing;

public class Main {
    public static void main(String[] args) {
        //Boxing
        //Unboxing

        int a = 20;

        //Autoboxing
        Integer b =a;//Integer.valueOf(a) olarak javai çerde yazıyor.

        //Boxing
        Integer c=Integer.valueOf(a);//c a dan boxing edildi.

        //AutoUnboxing
        int d=c;//c.intValue() işşlemini arka  planda yapılıyor.

        int i = c.intValue();
        System.out.println(c);


    }
}
