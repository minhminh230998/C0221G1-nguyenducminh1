package baitap.cai_dat__thuat_toan_sap_xep_chen;

import java.util.Arrays;

public class BinaryInsertionSort {
    public void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];

            // Tìm vị trí để chèn bằng tìm kiếm nhị phân
            int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);

            // Chuyển mảng sang đúng một vị trí
            System.arraycopy(array, j, array, j + 1, i - j);

            // Đặt phần tử vào đúng vị trí của nó
            array[j] = x;
        }
    }
    public static void main(String[] args) {
        final int[] arr = { 12, 11, 13, 5, 6 };

        new BinaryInsertionSort().insertionSort(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }


}
