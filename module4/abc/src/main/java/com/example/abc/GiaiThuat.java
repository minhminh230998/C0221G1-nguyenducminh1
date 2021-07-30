package com.example.abc;

public class GiaiThuat {
    public static int[] maxElement(int no_of_rows, int[][] arr) {
        int i = 0;


        int max = 0;
        int[] result = new int[no_of_rows];
        while (i < no_of_rows) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            result[i] = max;
            max =0;
            i++;

        }
        return result;

}
    public static void main(String[] args) {
        int arr[][] = {
                {3, 1, 2,3},
                {5, 3, 4,5},
                {7, 5, 6,7},
                {8, 5, 6,9},

        };

     int[] a=GiaiThuat.maxElement(4,arr);
        for (int i = 0; i < a.length; i++) {
            System.out.printf(String.valueOf(a[i]));

        }
        System.out.printf(String.valueOf(arr.length));

    }


}
