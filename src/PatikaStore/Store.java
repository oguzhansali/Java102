package PatikaStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    private List<NoteBook>notebookList;
    private List<CepTelefonu>cepTelefonuList;
    private List<Markalar>markalarList;

    public Store(){
        notebookList = new ArrayList<>();
        cepTelefonuList=new ArrayList<>();
        markalarList=new ArrayList<>();

        markalarList.add(new Markalar(1,"Apple"));
        markalarList.add(new Markalar(2,"Asus"));
        markalarList.add(new Markalar(3,"Casper"));
        markalarList.add(new Markalar(1,"Hp"));
        markalarList.add(new Markalar(1,"Huawei"));
        markalarList.add(new Markalar(1,"Lenovo"));
        markalarList.add(new Markalar(1,"Monstor"));
        markalarList.add(new Markalar(1,"Samsung"));
        markalarList.add(new Markalar(1,"Xiaomi"));


        notebookList.add(new NoteBook(1,"HUAWEI Matebook 14",7000.0,"Huawei",512,14.0,16));
        notebookList.add(new NoteBook(1,"LENOVO V14 IGL",3699.0,"Lenovo",1024,14.0,8));
        notebookList.add(new NoteBook(1,"ASUS Tuf Gaming",8199.0,"Asus",2048,15.6,32));

        cepTelefonuList.add(new CepTelefonu(1,"SAMSUNG GALAXY A51",3199.0,"Samsung",128,6.5,6,32,4000.0,"Siyah"));
        cepTelefonuList.add(new CepTelefonu(2,"iPhone 11 64 GB",7379.0,"Apple",64,6.1,6,5,3046.0,"Mavi"));
        cepTelefonuList.add(new CepTelefonu(3,"Redmi Note 10 Pro 8GB",4012.0,"Xiaomi",128,6.5,12,35,4000.0,"Beyaz"));
    }
    public void open() {
        Scanner input = new Scanner(System.in);
        boolean exit = false;



        while (!exit) {
            System.out.println("PatikaStore Ürün Yönetim Paneli!");
            System.out.println("1-Notebook İşlemleri");
            System.out.println("2-Cep telefonu işlemleri");
            System.out.println("3-Marka Listele");
            System.out.println("0-Çıkış Yap");
            System.out.println("Yapmak istediğiniz işlemi seçiniz:");
            int selcet = input.nextInt();
            System.out.println("Tercihiniz: " + selcet);

            switch (selcet) {
                case 0:
                    exit = true;
                    System.out.println("Çıkış Yapıldı.");
                    break;
                case 1:
                    System.out.println("Notebook Listesi");
                    displayNotebooks();
                    break;
                case 2:
                    System.out.println("Cep telefonu işlemleri");
                    displayCepTelefonları();
                    break;
                case 3:
                    System.out.println("Marka listeleme");
                    System.out.println(markalarList);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem seçtiniz lütfen tekrar seçiniz.");


            }
            System.out.println();

        }
        input.close();
    }
    private void displayNotebooks(){
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (NoteBook noteBook: notebookList){
            noteBook.display();
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
    private void displayCepTelefonları(){
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (CepTelefonu telefon:cepTelefonuList){
            telefon.display();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");



    }

}
