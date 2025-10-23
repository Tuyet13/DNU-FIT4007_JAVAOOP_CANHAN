import java.util.Scanner;

public class KyTuTiepTheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ký tự (từ 'a' đến 'y'): ");
        char ch = sc.next().charAt(0);  // đọc 1 ký tự đầu tiên người dùng nhập

        if (ch >= 'a' && ch <= 'y') {
            char next = (char) (ch + 1);  // chuyển sang ký tự kế tiếp
            System.out.println("Ký tự liền sau là: " + next);
        } else {
            System.out.println("Ký tự không hợp lệ! Phải nằm trong khoảng 'a' đến 'y'.");
        }
    }
}
