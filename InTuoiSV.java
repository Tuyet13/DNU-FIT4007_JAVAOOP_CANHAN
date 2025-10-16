import java.util.Scanner;

public class InTuoiSV {
    public static void main(String[] args) {
        int namHienTai = 2023;
        Scanner sc = new Scanner(System.in);
        long namSinh;

        while (true) {
            System.out.print("Nhap nam sinh Sinh Vien: ");
            namSinh = sc.nextLong();

            if (namSinh > namHienTai) {
                System.out.println("Nam sinh khong hop le! Vui long nhap lai.");
            } else {
                break; 
            }
        }

        long tuoi = namHienTai - namSinh;
        System.out.println("Tuoi sinh vien la: " + tuoi);
    }
}
