package tinhtoan2so;

import java.util.Scanner;

public class TinhToan2So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen b: ");
        int b = sc.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;

        System.out.println("Tong = " + tong);
        System.out.println("Hieu = " + hieu);
        System.out.println("Tich = " + tich);

        if (b != 0) {
            int thuongNguyen = a / b;
            double thuongThuc = (double) a / b;
            System.out.println("Thuong (chia nguyen) = " + thuongNguyen);
            System.out.println("Thuong (chia thuc) = " + thuongThuc);
        } else {
            System.out.println("Khong the chia cho 0!");
        }

        sc.close();
    }
}
