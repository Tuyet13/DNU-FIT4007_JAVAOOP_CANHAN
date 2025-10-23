import java.util.Scanner;

public class TenVaDoDai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten cua ban: ");
        String ten = sc.nextLine();

        int doDai = ten.length();
        System.out.println("Do dai la: " + doDai);
    }
}
