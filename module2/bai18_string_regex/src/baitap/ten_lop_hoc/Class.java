package baitap.ten_lop_hoc;

import java.util.regex.Pattern;

public class Class {
    private  static final String NAME_CLASS="^[CAP][0-9]{4}[GHIKML]$";
    public static void nameClass(){
        String[] nameClass=new String[6];
        nameClass[0]="C1234M";
        nameClass[1]="U1234M";
        nameClass[2]="A1234M";
        nameClass[3]="C1234L";
        nameClass[4]="U1234M";
        nameClass[5]="C1234444M";
        for (int i = 0; i <nameClass.length ; i++) {
            if(Pattern.matches(NAME_CLASS,nameClass[i])){
                System.out.println(nameClass[i]);
            }
        }

    }

    public static void main(String[] args) {
        nameClass();
    }
}
