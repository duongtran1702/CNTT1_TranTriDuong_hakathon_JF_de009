package hakathon;

import java.util.Scanner;

public class Cau2_Phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Số phần tủ không hợp lệ!");
            return;
        }

        System.out.print("Nhap cac phan tu: ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhap x: ");

        int x = sc.nextInt();
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != x) {
                arr[k++] = arr[i];
            }
        }

        n = k;
        if (n == 0) {
            System.out.println("Mảng rỗng");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
