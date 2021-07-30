package baitap.so_dien_thoai;

import java.util.regex.Pattern;

public class SoDienThoai {
    private static final String SDT="^\\(84\\)\\-\\(0[0-9]{9}\\)$";
    public static void sdt(){
        String a="(84)-(0123456789)";
        if(Pattern.matches(SDT,a)){
            System.out.println("đúng");
        }else {
            System.out.println("sai");
        }
    }

    public static void main(String[] args) {
        sdt();
    }
}
