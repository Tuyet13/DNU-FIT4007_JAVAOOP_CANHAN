import java.util.Scanner;

public class cvDThinhTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        float a = sc.nextFloat();
        System.out.printf("Nhap canh b: ");
        float b = sc.nextFloat();
        System.out.printf("Nhap canh c: ");
        float c = sc.nextFloat();
        if (a+b> c && a+c > b && b+c > a ) {
            double CV = a + b + c;
            double p = CV/2;
            double DT = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Chi vi la: " + CV);
            System.out.println("dien  tich la: " + DT);
        }
        else {
            System.out.printf("Ban nhap khong phai la tam giac!!");
        }
    }
}
