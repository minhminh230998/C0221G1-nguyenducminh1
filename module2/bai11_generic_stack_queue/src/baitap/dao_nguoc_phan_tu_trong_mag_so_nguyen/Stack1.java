package baitap.dao_nguoc_phan_tu_trong_mag_so_nguyen;

import java.util.Arrays;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int n= stack.size();
        int[] a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = stack.pop();
        }
        for (int i = 0; i <n; i++) {
            stack.push(a[i]);
        }
        System.out.println(stack);
        Stack<String> mWork = new Stack<>();
        mWork.push("a");
        mWork.push("b");
        mWork.push("c");
        mWork.push("d");
        mWork.push("e");
        int m= stack.size();
        String[] b=new String[m];
        for (int i = 0; i <m ; i++) {
            b[i] = mWork.pop();
        }
        Stack<String> wStart = new Stack<>();
        for (int i = 0; i <m; i++) {
            wStart.push(b[i]);
        }
        System.out.println(wStart);

    }

}
