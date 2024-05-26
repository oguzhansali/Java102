package Nested;
//Outer Class
public class Out {

    public int a=5;
    public static int b=14;


    //Inner class
    public class In{
        public static int a=20;

        public static void  run(){
            System.out.println("In clası çalıştı.");
            int a = 1;
            System.out.println(a);
            System.out.println(In.a);
            System.out.println(Out.b);

        }
    }

    public  void  run(){

        In.run();
    }

    public In getIn(){
        In in = new In();
        return in;
    }
}
