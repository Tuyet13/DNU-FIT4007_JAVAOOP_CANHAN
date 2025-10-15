import java.util.Scanner;

public class hinhtron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        float a = sc.nextFloat();
        System.out.println("nhap chieu rong: ");
        float b = sc.nextFloat();
        //tinh toan
        float Cv = (a+b)/2;
        System.out.println("Cv: " + Cv);
        float DT = a*b;
        System.out.println("DT: " + DT);
    }
}
