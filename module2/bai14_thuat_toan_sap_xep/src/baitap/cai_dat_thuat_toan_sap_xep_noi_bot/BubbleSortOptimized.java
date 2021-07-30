package baitap.cai_dat_thuat_toan_sap_xep_noi_bot;

public class BubbleSortOptimized {
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] và arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Nếu không có phần tử nào để hoán đổi
            // bên trong vòng lặp thì Break
            if (swapped == false)
                break;
        }
    }

    // In các phần tử của mảng
    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 1, 4, 2, 8 };
        int n = arr.length;
        System.out.println("Mảng ban đầu:");
        printArray(arr, n);
        bubbleSort(arr, n);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr, n);
    }
}
