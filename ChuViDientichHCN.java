import java.util.Scanner;

public class ChuViDientichHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double cd = sc.nextDouble();
        System.out.print("nhap chieu rong: ");
        double rong = sc.nextDouble();
        double CV = (cd + rong)*2;
        double DT = cd * rong;
        System.out.println("chu vi la: " + CV);
        System.out.println("Dien tich la: " + DT);
    }
}
