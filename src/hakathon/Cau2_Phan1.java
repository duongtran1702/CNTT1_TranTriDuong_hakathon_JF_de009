package hakathon;

import java.util.Scanner;

public class Cau2_Phan1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Số phần tử không hợp lệ!");
            return;
        }

        int[] arr = new int[n];

        System.out.print("Nhap cac phan tu: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // vị trí số dương tiếp theo
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                int temp = arr[i];
                int j = i;

                // dịch phần tử
                while (j > k) {
                    arr[j] = arr[j - 1];
                    j--;
                }

                arr[k] = temp;
                k++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
