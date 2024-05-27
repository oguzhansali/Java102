package Generic.GenericMetot;

public class Print {
    public static <T,U,A> void printArray(T[] arr,U[] arr2,A[] arr3){
        for (T i:arr){
            System.out.println(i);
        }
        for (U i:arr2){
            System.out.println(i);
        }
        for (A i:arr3){
            System.out.println(i);
        }
    }
}
