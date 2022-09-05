package change.money;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usd;
        System.out.println("Nhap USD: ");
        usd = sc.nextDouble();
        double result = usd * 23000;
        System.out.println("Gia tri VND la: " + result);
    }
}
