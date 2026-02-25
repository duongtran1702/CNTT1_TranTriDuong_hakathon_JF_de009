package hakathon;

import java.util.Scanner;

public class Cau1_Phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        if (s.trim().isEmpty()) {
            System.out.println("Chuỗi không hợp lệ !!");
            return;
        }

        String tmp = s.toLowerCase();

        int[] count = new int[256];

        for (int i = 0; i < tmp.length(); i++) {
            char ch = tmp.charAt(i);
            if (ch != ' ') {
                count[ch]++;
            }
        }

        int max = 0;

        for (int i = 0; i < tmp.length(); i++) {
            char ch = tmp.charAt(i);
            if (ch != ' ') {
                if (count[ch] > max) {
                    max = count[ch];
                }
            }
        }

        for (int i = 0; i < tmp.length(); i++) {
            char ch = tmp.charAt(i);
            if (ch != ' ') {
                if (count[ch] == max) {
                    System.out.println(ch + " : " + max);
                    break;
                }
            }
        }


    }
}
