package Generic.Sınıflar;

public class Main {
    public static void main(String[] args) {
        /*
        //String bir değer için
        String str=" ";
        Nullable num = new Nullable(str);
        num.run();

        Integer a =0;
        NullableInteger num = new NullableInteger(a);
        num.run();
        //Generic veri tipi.
        Integer a =23;
        String b="123";

        Nullable<String> num=new Nullable<>(b);
        num.run();*/

        Integer a = 10;
        String b = "PATİKA";
        Double d=3.14;
        String c="dev";
        Test<Integer,String,Double> gen = new Test<>(a,b,d);
        gen.setObj2(c);
        gen.showInfo();
    }
}
