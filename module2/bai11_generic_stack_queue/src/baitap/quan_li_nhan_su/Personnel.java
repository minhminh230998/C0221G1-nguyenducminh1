package baitap.quan_li_nhan_su;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.text.DateFormat;
import java.util.Collections;

public class Personnel {
    private String name;
    private String age;
    private String gender;

    public Personnel() {
    }

    public Personnel(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Personnel{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                '}'+"\n";
    }

    public static void main(String[] args) {
        Personnel personnel1 = new Personnel("minh", "23/9/2003", "nam");
        Personnel personnel2 = new Personnel("đưc", "30/2/2005", "nữ");
        Personnel personnel3 = new Personnel("thúy", "1/1/1999", "nữ");
        Personnel personnel4 = new Personnel("tấn", "27/7/2007", "nam");
        List<Personnel> listpersonnels = new ArrayList<>();
        listpersonnels.add(personnel1);
        listpersonnels.add(personnel2);
        listpersonnels.add(personnel3);
        listpersonnels.add(personnel4);

        Collections.sort(listpersonnels, new Comparator<Personnel>() {
            DateFormat f = new SimpleDateFormat("MM/dd/yyyy");
            @Override
            public int compare(Personnel o1, Personnel o2) {
                try {
                    return f.parse(o1.getAge()).compareTo(f.parse(o2.getAge()));
                } catch (ParseException | java.text.ParseException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        });
        listpersonnels.sort(Comparator.comparing(Personnel::getGender).reversed());
        System.out.println(listpersonnels);

    }


}
