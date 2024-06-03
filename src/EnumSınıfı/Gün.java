package EnumSınıfı;

public class Gün {
    private int day;
    public   static final  Gün Pazartesi = new Gün(1);
    public   static final  Gün Salı = new Gün(2);
    public   static final  Gün Çarşamba = new Gün(3);
    public   static final  Gün Perşembe = new Gün(4);
    public   static final  Gün Cuma = new Gün(5);
    public   static final  Gün Cumartesi = new Gün(6);
    public   static final  Gün Pazar = new Gün(7);


    Gün(int day){
        this.day=day;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day=day;
    }

}
