package TreeSet;

import java.util.TreeSet;

public class Main  {
    public static void main(String[] args) {
        //OrderNote order = new OrderNote();
        TreeSet<Student> students=new TreeSet<>(new OrderName());//İsme göre bir sıralama işlem iyapılır.TreeSet içinde giridğimiz clasa göre sıralamak istediklerimiz değişebilir.
        students.add(new Student("OĞUZHAN",50));
        students.add((new Student("Ahmet",100)));
        students.add((new Student("Cansu",70)));
        students.add((new Student("Zehra",84)));
        students.add((new Student("Ahmet",61)));

        for (Student stu:students){
            System.out.println(stu.getName());
        }

    }
}
