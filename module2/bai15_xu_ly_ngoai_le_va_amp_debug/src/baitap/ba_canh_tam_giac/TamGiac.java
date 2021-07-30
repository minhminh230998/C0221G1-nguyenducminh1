package baitap.ba_canh_tam_giac;

import com.sun.xml.internal.txw2.IllegalAnnotationException;

import java.util.Scanner;
public class TamGiac extends Throwable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập 3 cạnh của tam giác");
        while (true) {
            try {
                System.out.println("nhập a");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println("nhập b");
                int b = Integer.parseInt(sc.nextLine());
                System.out.println("nhập c");
                int c = Integer.parseInt(sc.nextLine());
                IllegalTriangleException(a,b,c);
                break;
            }catch (TamGiac e){
                System.out.println("đây không phải là tam giác");
            }
            catch (NumberFormatException ex){
                System.out.println(ex.getMessage());
            }

        }

    }
    public static void  IllegalTriangleException(int a,int b,int c)throws TamGiac{
        if(a+b<=c||a+c<=b||b+c<=a||a<=0||b<=0||c<=0){
            throw new TamGiac();
        }
    }
}
