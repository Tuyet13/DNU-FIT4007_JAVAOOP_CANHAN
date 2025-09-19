package hinhtron;

import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap ban kinh
        System.out.print("Nhap ban kinh r: ");
        double r = sc.nextDouble();

        // Tinh chu vi va dien tich
        double chuVi = 2 * Math.PI * r;
        double dienTich = Math.PI * r * r;

        // In ket qua
        System.out.println("Chu vi hinh tron = " + chuVi);
        System.out.println("Dien tich hinh tron = " + dienTich);

        sc.close();
    }
}
