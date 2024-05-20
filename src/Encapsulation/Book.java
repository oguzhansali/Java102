package Encapsulation;

public class Book {
    private   String name;
    private  int pageNumber;

    public Book(String name,int pageNumber){
        this.name=name;
        if (pageNumber<0){
            pageNumber=0;
        }
        this.pageNumber=pageNumber;
    }

    public  int showPageNumner(){
        return this.pageNumber;
    }
    public void changePageNumber(int pageNumber){
        if (pageNumber<0){
            pageNumber=0;
        }
        this.pageNumber=pageNumber;
    }

    public String getName(){
        return this.name=name;

    }
    public String changeName(String name){
         return this.name=name;
    }
}
