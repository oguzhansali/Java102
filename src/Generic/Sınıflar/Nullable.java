package Generic.Sınıflar;

public class Nullable <T> {
    private final T value;
    public Nullable(T value){
        this.value=value;
    }
    public T getValue(){
        return this.value;
    }
    public boolean isNull(){
        return this.getValue()==null;
    }
    public void run(){
        if (isNull()){
            System.out.println("Bu değişkene değer atanmamıştır(null) ");
        }else {
            System.out.println(this.getValue());
        }
    }

}
