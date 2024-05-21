package LinkedHashMapAndTreeMap;

import TreeSet.Student;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, Student> students = new TreeMap<>(new OrderByNoComparator());

        students.put(102,new Student("OĞUZHAN",100));
        students.put(110,new Student("Damla",25));
        students.put(108,new Student("Ahmet",77));
        students.put(118,new Student("Cemre",40));
         for (Student stu : students.values()){
             System.out.println(stu.getName());
         }
    }
}
