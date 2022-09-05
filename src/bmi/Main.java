package bmi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height,weight,bmi;

        System.out.println("Nhap chieu cao (m): ");
        height = sc.nextDouble();

        System.out.println("Nhap can nang (kg): ");
        weight = sc.nextDouble();

        bmi = weight / Math.pow(height, 2); //hàm Math.pow(x,2) để bình phương của một số

        if (bmi < 18.5) {
            System.out.println("bmi = "+ bmi +" -> Nhu que tam");
        } else if (18.5 <= bmi && bmi <25 ) {
            System.out.println("bmi = "+ bmi + "-> Binh thuong");
        } else if (25 <= bmi && bmi < 30) {
            System.out.println("bmi = "+ bmi + "-> Thua can");
        } else {
            System.out.println("bmi = "+ bmi + "-> Beo phi");
        }
    }
}
