package KitapSıralayıcı;


//Book sınıfı Comparable arayüzünü implemente ediyor.
public class Book implements  Comparable<Book>  {
    //Nitelikler oluşturuldu.
    private String name;
    private int page;
    private String byWho;
    private String date;
    //Yapıcı metod  oluşturuldu.
    public Book(String name,int page,String byWho,String date){
        this.name=name;
        this.page=page;
        this.byWho=byWho;
        this.date=date;
    }
    //Kitap özelikkerlini döndüren ve ayarlayan get  ve set motodları oluuşturuldu.
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getPage(){
        return page;
    }
    public void setPage(int page){
        this.page=page;
    }
    public String getByWho(){
        return byWho;
    }
    public void setByWho(String byWho){
        this.byWho=byWho;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date=date;
    }

    //Kitap ismine göre karşılaştırma  yaparak metod.
    @Override
    public int compareTo(Book other){
        return this.name.compareTo(other.name);
    }
    //Kitap bilgilerini döndürür.
    @Override
    public String toString(){
        return "[Kitap ismi: "+name+"--"+
                " Sayfa sayısı: "+page+"--"+
                " Yazarı: "+byWho+"--"+
                " Yayınlanma tarigi: " +date+"]";
    }

}
