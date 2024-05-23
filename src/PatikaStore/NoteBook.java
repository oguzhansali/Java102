package PatikaStore;

public class NoteBook extends Katogoriler{
    public NoteBook(int id,String name,double price,String marka,int depolama,double ekran,int ram){
        super(id, name, price, marka, depolama, ekran, ram);
    }
    @Override
    public void display(){
        System.out.printf("| %-2d | %-30s | %-8.1f TL | %-9s | %-9d | %-9.1f | %-10d |%n",
                getId(),getName(),getPrice(),getMarka(),getDepolama(),getEkran(),getRam());
    }


}
