package PatikaStore;

public abstract class Katogoriler {
    private  int id;
    private  String name;
    private double price;
    private  String marka;
    private int depolama;
    private double ekran;
    private int ram;

    public Katogoriler(int id,String name,double price,String marka,int depolama,double ekran,int ram){
        this.id=id;
        this.name=name;
        this.price=price;
        this.marka=marka;
        this.depolama=depolama;
        this.ekran=ekran;
        this.ram=ram;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getMarka(){
        return marka;
    }
    public void setMarka(String marka){
        this.marka=marka;
    }
    public int getDepolama(){
        return depolama;
    }
    public void setDepolama(int depolama){
        this.depolama=depolama;
    }
    public double getEkran(){
        return ekran;
    }
    public  void  setEkran(double ekran){
        this.ekran=ekran;
    }
    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        this.ram=ram;
    }


    public abstract void display();
}
