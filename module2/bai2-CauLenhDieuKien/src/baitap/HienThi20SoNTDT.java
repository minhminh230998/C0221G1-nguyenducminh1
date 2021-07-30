package baitap;

public class HienThi20SoNTDT {
    public static void main(String[] args) {
        int num=2;
        String SNT=" ";
        int count=0;
        while(count<20){
            if(CheckSNT(num)==true){
                SNT+=num +",";
                num++;
                count++;
            }
            else {
                num++;
            }
        }


        System.out.println(SNT);
    }
    public static boolean CheckSNT(int num){
        boolean check=true;
        if(num<2){
            check=false;
        }else {
            if(num==2){
                check=true;
            }else if(num>2){
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        check = false;
                        break;
                    }
                }
            }
        }
        return check;
    }
}
