package thuchanh.phan_biet_hashmap_and_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("minh",22,"điện bàn");
        Student student2=new Student("đức",23,"điện bàn");
        Student student3=new Student("thúy",24,"điện bàn");
        Student student4=new Student("tấn ",19,"điện bàn");
        Student student5=new Student("tâm",33,"điện bàn");
        Map<Integer, Student> listStudent=new HashMap<>();
        listStudent.put(1,student1);
        listStudent.put(2,student2);
        listStudent.put(3,student3);
        listStudent.put(4,student4);
        listStudent.put(5,student5);

        for(Map.Entry<Integer, Student> student : listStudent.entrySet()) {
            System.out.println(student.toString());
        }
        Set<Student> listStudent1=new HashSet<>();
        listStudent1.add(student1);
        listStudent1.add(student2);
        listStudent1.add(student3);
        listStudent1.add(student4);
        listStudent1.add(student5);

        for(Student student : listStudent1){
            System.out.println(student.toString());
        }
    }
}
