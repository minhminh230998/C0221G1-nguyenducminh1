package baitap;

public class SNTNhoHon100 {
    public static void main(String[] args) {
        String SNT=" ";
        for (int i = 0; i <100 ; i++) {
            if(CheckSNT(i)==true){
                SNT+=i +",";
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
