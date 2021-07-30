package thuchanh;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size:");
        size = scanner.nextInt();
        if (size > 20) {
            System.out.println("Size does not exceed 20");
        } else {
            array = new int[size];
            for (int i = 0;i < array.length;i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
                System.out.println("bạn nhập"+array[i]);
            }
            for (int j = 0; j < array.length / 2; j++) {
                int temp = array[j];
                array[j] = array[size - 1 - j];
                array[size - 1 - j] = temp;
            }
            System.out.printf(" Reverse array: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
        }
    }
}
