package hakathon;

import java.util.Scanner;

public class Cau3 {
    public static boolean contains(int[] arr, int end, int val) {
        for (int i = 0; i < end; i++) {
            if (arr[i] == val) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n:");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.print("Nhập các phần tử của mảng A: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Nhập m:");
        int m = sc.nextInt();
        int[] B = new int[m];

        System.out.print("Nhập các phần tử của mảng B: ");
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (!contains(A, i, A[i])) {
                result.append(A[i]).append(" ");
            }
        }

        for (int i = 0; i < m; i++) {
            if (!contains(A, n, B[i])) {
                if (!contains(B, i, B[i])) {
                    result.append(B[i]).append(" ");
                }
            }
        }

        System.out.println("Output: "+result.toString());

    }
}
