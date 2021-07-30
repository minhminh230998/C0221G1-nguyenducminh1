package thuchanh;

import java.util.Scanner;

public class DoCSangDoF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào độ C");
        double doC=sc.nextDouble();
        System.out.println(celsiusToFahrenheit(doC));
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
