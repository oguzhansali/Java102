package Wrapper;

public class Main {
    public static void main(String[] args) {
        //İlkel veri tiplerini wrapper sınıflara   çevirmemize yarıyor.(parseInt gibi terimler.)
        //SARMALIYICI(WRAPPER) int veya string gibi tanımlanmış işlemleri farklı şekilde wrapper sınıfı ile değiştirmeye  yarar.
       String a = "10";
       int c = Integer.parseInt(a);
       int b=20;
        System.out.println(Integer.parseInt(a)+b);

    }
}
