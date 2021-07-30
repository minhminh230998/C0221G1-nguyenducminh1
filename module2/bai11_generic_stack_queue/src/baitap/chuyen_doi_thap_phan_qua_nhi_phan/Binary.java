package baitap.chuyen_doi_thap_phan_qua_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    static int  Decimal;
    int binaryNumber;
    static Stack<Integer> binary = new Stack<>();

    static void decimailOnBinary(int Decimal) {
        while (Decimal > 0) {
            int temp;
            int soDu;
            temp = Decimal / 2;
            soDu = Decimal % 2;
            Decimal = temp;
            binary.push(soDu);
        }
        while (binary.size()>0){
            System.out.print(binary.pop());
        }
    }
     static void BinaryToDecimal(int binaryNumber){
        int p = 0;
        while(true){
            if(binaryNumber == 0){
                break;
            } else {
                int temp = binaryNumber%10;
                Decimal += temp*Math.pow(2, p);
                binaryNumber = binaryNumber/10;
                p++;
            }
        }
        System.out.println(Decimal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào");
       decimailOnBinary(Integer.parseInt(sc.nextLine()));
        BinaryToDecimal(Integer.parseInt(sc.nextLine()));
    }
}
