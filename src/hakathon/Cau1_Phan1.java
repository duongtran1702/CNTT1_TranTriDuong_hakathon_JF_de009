package hakathon;

import java.util.Scanner;

public class Cau1_Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        if (s.trim().isEmpty()) {
            System.out.println("Chuỗi không hợp lệ !!");
            return;
        }

        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
            } else {
                if (!temp.isEmpty()) {
                    temp.reverse();
                    result.append(temp).append(" ");
                    temp.setLength(0);
                } else {
                    result.append(s.charAt(i));
                }

            }
        }
        if (!temp.isEmpty()) {
            temp.reverse();
            result.append(temp);
        }

        System.out.println(result.toString());

    }
}
