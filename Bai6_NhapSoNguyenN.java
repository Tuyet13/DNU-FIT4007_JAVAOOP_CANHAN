import java.util.Scanner;
//Nhập vào một số nguyên N, hãy in ra chữ số cuối cùng của số đó.
//Gợi ý: Chữ số cuối cùng của só n chính là kết quả của phép chia lấy phần dư của n cho 10.
//        Ví dụ, để lấy chữ số cuối cùng của 123, ta lấy 123 chia cho 10 và lấy phần dư, 123 chia 10 được 12 dư 3, vậy chữ số cuối cùng của 123 là 3.
//        Trong Java, phép chia lấy dư được biểu diễn bằng ký tự %.
//Ví dụ 5 % 2 = 1, 123 % 10 = 3,...
//Lưu ý cần lấy trị tuyệt đối Math.abs() để tránh trường hợp n < 0

public class Bai6_NhapSoNguyenN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        int SoCuoi = n % 10;
        System.out.print(SoCuoi);
    }
}
