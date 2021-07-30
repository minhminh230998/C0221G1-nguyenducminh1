package baitap;

import java.util.Scanner;

public class MyClass {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        String text="anh yeu em nhieu vcl";
//        String[] arr=text.split("");
//        String tim=sc.nextLine();
//        int coust=0;
//        for (int i = 0; i <arr.length ; i++) {
//            if(tim.indexOf(arr[i])!=-1){
//                coust++;
//            }
//        }
//        System.out.println(coust);

    //    }
    void method(int[] x) {
        x[0] = 5;
        x[1] = 5;
    }

    public static void main(String[] args) {
        MyClass o = new MyClass();
        int[] x = {1, 1};
        o.method(x);
        System.out.printf("x=%d, y=%d", x[0], x[1]);
    }
}
