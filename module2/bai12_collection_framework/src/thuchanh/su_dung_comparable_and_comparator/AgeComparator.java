package thuchanh.su_dung_comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("a", 13, "điện bàn");
        Student student2 = new Student("b", 15, "điện bàn");
        Student student3 = new Student("d", 17, "điện bàn");
        Student student4 = new Student("c", 12, "điện bàn");
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        for (Student s : studentList) {
            System.out.println(s.toString());
        }
        AgeComparator n = new AgeComparator();
        Collections.sort(studentList, n);
        for (Student st : studentList) {
            System.out.println(st.toString());
        }
    }
}
