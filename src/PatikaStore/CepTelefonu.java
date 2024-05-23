package PatikaStore;

public class CepTelefonu extends Katogoriler {
    private int kamera;
    private double pil;
    private String renk;

    public CepTelefonu(int id,String name,double price,String marka,int depolama,double ekran,int ram,int kamera,double pil,String renk){
        super(id, name, price, marka, depolama, ekran, ram);
        this.kamera=kamera;
        this.pil=pil;
        this.renk=renk;
    }
    public int getKamera(){
        return kamera;
    }
    public void setKamera(int kamera){
        this.kamera=kamera;
    }
    public double getPil(){
        return pil;
    }
    public void setPil(double pil){
        this.pil=pil;
    }
    public String getRenk(){
        return renk;
    }
    public void setRenk(String renk){
        this.renk=renk;
    }


    @Override
    public void display() {
        System.out.printf("| %-2d | %-30s | %-8.1f TL | %-9s | %-9d | %-9.1f | %-9d | %-8.1f | %-9d | %-10s |%n",
                getId(),getName(),getPrice(),getMarka(),getDepolama(),getEkran(),getKamera(),getPil(),getRam(),getRenk());
    }
}


