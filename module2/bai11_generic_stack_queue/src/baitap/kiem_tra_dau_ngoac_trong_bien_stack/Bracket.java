package baitap.kiem_tra_dau_ngoac_trong_bien_stack;

import java.util.Stack;

public class Bracket {


    public static boolean check(String string) {
        Stack<String> bStack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                bStack.push("(");
            }
            if (string.charAt(i) == ')') {
                if (bStack.isEmpty()) {
                    return false;
                }
                bStack.pop();

            }
        }
        if (bStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String a = "s * (s – a) * (s – b) * (s – c)";
        String b = "(– b + (b2 – 4*a*c)^0.5) / 2*a ";
        String c = "s * (s – a) * (s – b * (s – c)";
        String d = "s * (s – a) * s – b) * (s – c)";
        System.out.println(check(a));
        System.out.println(check(b));
        System.out.println(check(c));
        System.out.println(check(d));
    }
}
