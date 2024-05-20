package Encapsulation;
//Encapsulation(Kapsülleme)=Filtreleme yaparak nesneler üzerindeki bir koruma kalkanı sağlar.Nesne üzerindeki anlamsızlıkları ortadan kaldırır.
//Inheritance(Kalıtım)=
//
public class Main {
    public static void main(String[] args) {
        Book LordOfTheRings= new Book("Lord of The Rings",-100);
        //LordOfTheRings.showPageNumner();
        LordOfTheRings.changePageNumber(-100);
        System.out.println(LordOfTheRings.showPageNumner());
        System.out.println(LordOfTheRings.getName());
        System.out.println(LordOfTheRings.changeName("The Lord of The Rings"));

        System.out.println("========================================");

        Book harrypotter = new Book("harrypotter",500);
        harrypotter.changePageNumber(350);
        System.out.println(harrypotter.showPageNumner());
        System.out.println(harrypotter.getName());
        System.out.println(harrypotter.changeName("Harry Potter"));
    }
}
