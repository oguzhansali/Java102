package ListeSınıfı;

public class MyList<T> {
    private T[] array;
    private static int size;
    private static int capaticy;

    //Boş constructor.
    public MyList() {
        this.array = (T[]) new Object[capaticy];
        this.size = 0;
        this.capaticy = 10;//Başlangıç kapasite.
    }

    //Kapasite belirten constructor.
    public MyList(int capaticy) {
        this.capaticy = capaticy;
        this.size = 0;
        this.array = (T[]) new Object[capaticy];
    }

    //Dii eleman sayıssını döndürür.
    public int size() {
        return size;
    }

    //Dizideki kapasiteyi döndürür.
    public int getCapaticy() {
        return capaticy;
    }

    //Eleman eklenir.
    public void add(T data) {
        if (size == capaticy) {//Kapasite doluysa
            capaticy *= 2;//Kapasite iki katına çıkarılır.
            T[] newArray = (T[]) new Object[capaticy];//Yeni dizi.
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];//Eski dizi yeni diziye  aktarılır.
            }

            array = newArray;
        }
        array[size++] = data;
    }

    //İstenilen indisteki elemanı döndürür.
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        return array[index];
    }

    //toString metodu.
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(array[i]);
            if (i < size - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }


}
