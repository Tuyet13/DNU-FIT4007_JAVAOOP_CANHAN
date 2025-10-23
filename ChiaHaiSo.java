import java.util.Scanner;

public class ChiaHaiSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = sc.nextInt();

        System.out.print("Nhập b (khác 0): ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Lỗi: b không được bằng 0!");
        } else {
            System.out.printf("%d / %d = %.7f", a, b, (double) a / b);
        }
    }
}
