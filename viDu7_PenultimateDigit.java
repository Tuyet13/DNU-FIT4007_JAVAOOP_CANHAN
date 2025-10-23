import java.util.Scanner;

public class viDu7_PenultimateDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen N: ");
        int n = sc.nextInt();
        long abs = Math.abs((long)n);
        if ( abs < 10){
            System.out.println("N phai co it nhat 2 chu so");
        }
        else {
            int penultimate = (int) ((abs / 10) % 10);
            System.out.println("So gan cuoi " + n + " là: " + penultimate);
        }
    }
}
