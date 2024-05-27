package ListeSınıfı;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList=new MyList<>(5);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println("Boyut: "+myList.size());
        System.out.println("Kapasite: "+myList.getCapaticy());
        System.out.println("Elemanlar: "+myList);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        System.out.println("Boyut: "+myList.size());
        System.out.println("Kapasite: "+myList.getCapaticy());
        System.out.println("Elemanlar: "+myList);

    }
}
