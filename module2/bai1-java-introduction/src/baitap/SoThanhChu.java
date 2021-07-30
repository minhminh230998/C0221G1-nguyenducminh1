package baitap;

import java.util.Scanner;

public class SoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số");
        int num = sc.nextInt();
        System.out.println(demTu1Den999(num));

    }

    public static String demTu1Den9(int so) {
        String chu = "";
        switch (so) {
            case 1:
                chu = "one";
                break;
            case 2:
                chu = "two";
                break;
            case 3:
                chu = "thre";
                break;
            case 4:
                chu = "four";
                break;
            case 5:
                chu = "five";
                break;
            case 6:
                chu = "six";
                break;
            case 7:
                chu = "seven";
                break;
            case 8:
                chu = "eight";
                break;
            case 9:
                chu = "nine";
                break;
        }
        return chu;
    }

    public static String demTu10Den19(int so1) {
        String chu1 = "";
        switch (so1) {
            case 10:
                chu1 = "ten";
                break;
            case 11:
                chu1 = "eleven";
                break;
            case 12:
                chu1 = "twelve";
                break;
            case 13:
                chu1 = "thirteen";
                break;
            case 14:
                chu1 = "fourteen";
                break;
            case 15:
                chu1 = "fifteen";
                break;
            case 16:
                chu1 = "sixteen";
                break;
            case 17:
                chu1 = "seventeen";
                break;
            case 18:
                chu1 = "eighteen";
                break;
            case 19:
                chu1 = "nineteen";
                break;
        }
        return chu1;
    }

    public static String demTu20Den90(int so2) {
        String chu2 = "";
        switch (so2) {
            case 20:
                chu2 = "Twenty";
                break;
            case 30:
                chu2 = "Thirty";
                break;
            case 40:
                chu2 = "Forty";
                break;
            case 50:
                chu2 = "fifty";
                break;
            case 60:
                chu2 = "sixty";
                break;
            case 70:
                chu2 = "seventy";
                break;
            case 80:
                chu2 = "eighty";
                break;
            case 90:
                chu2 = "ninety";
                break;
        }
        return chu2;

    }

    public static String demTu21Den99(int so3) {
        int hangchuc = so3 / 10;
        hangchuc = hangchuc * 10;
        int hangdonvi = so3 % 10;
        return demTu20Den90(hangchuc) +" "+ demTu1Den9(hangdonvi);
    }

    public static String demTu1Den99(int so5) {
        String chu5 = "";
        if (so5 < 10) {
            chu5 = demTu1Den9(so5);
        } else if (so5 < 20) {
            chu5 = demTu10Den19(so5);
        } else if (so5 % 10 == 0 && so5 >= 20) {
            chu5 = demTu20Den90(so5);
        } else if (so5 > 20 && so5 <= 99) {
            chu5 = demTu21Den99(so5);
        }
        return chu5;
    }

    public static String demTu1Den999(int so6) {
        String chu6 = "";
        int hangtram = so6 / 100;
        int hangchuc = so6 % 100;


        if (hangtram >= 1 && hangchuc != 0) {
            chu6 = demTu1Den9(hangtram) + " hundred " + demTu1Den99(hangchuc);
        } else if (hangtram >= 1 && hangchuc == 0) {
            chu6 = demTu1Den9(hangtram) + " hundred ";
        } else if (hangtram < 1) {
            chu6 = demTu1Den99(hangchuc);
        }
        return chu6;
    }
}
