package Nested;

public class Main {
    public static void main(String[] args) {
        //Nested Class(İç içe sınıflar)
        // -Inner Class(İç sınıflar)
        //-static
        //-non-static
        //-Local Class(Yerel sınıflar)
        //-Anonymus Class(Anonim Sınıflar)

        /*
        ------Static claslar için--------
        Out o = new Out();
        Out.In in = o.new In();
        in.run();

        Out o = new Out();
        Out.In inNesnesi = o.getIn();
        inNesnesi.run();


        //Out o = new Out();
        Out.In.run();*/
        /*
        ---------Local sınıflar----
        Local l = new Local();
        l.run();*/
        Anonymus a = new Anonymus(){
          public  int a = 20;
          @Override
          public void run(){
              System.out.println(this.a);
              System.out.println("Anonim olarak yazılmış run metodu.");
              print();
          }
          public void print(){
              System.out.println("Priint metodu.");
          }
        };
        a.run();

    }
}
