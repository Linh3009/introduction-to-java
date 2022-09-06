package number.into.words;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, a, b, c;

        System.out.println("Nhap number: ");
        number = sc.nextInt();

        a = number / 100; // Lấy hàng trăm
        b = (number % 100) / 10; // Lấy hàng chục
        c = ((number % 100) % 10); // Lấy hàng đơn vị

        switch (a) {
            case 0:
                if (a == 0) {
                    System.out.print("");
                    break;
                }
            case 1:
                System.out.print("One hundred");
                break;
            case 2:
                System.out.print("Two hundred");
                break;
            case 3:
                System.out.print("Three hundred");
                break;
            case 4:
                System.out.print("Four hundred");
                break;
            case 5:
                System.out.print("Five hundred");
                break;
            case 6:
                System.out.print("Six hundred");
                break;
            case 7:
                System.out.print("Seven hundred");
                break;
            case 8:
                System.out.print("Eight hundred");
                break;
            case 9:
                System.out.print("Nine hundred");
                break;
        }
        switch (b) {
            case 1:
                System.out.print("");
                break;
            case 2:
                System.out.print(" twenty");
                break;
            case 3:
                System.out.print(" thirty");
                break;
            case 4:
                System.out.print(" forty");
                break;
            case 5:
                System.out.print(" fifty");
                break;
            case 6:
                System.out.print(" sixty");
                break;
            case 7:
                System.out.print(" seventy");
                break;
            case 8:
                System.out.print(" eighty");
                break;
            case 9:
                System.out.print(" ninety");
                break;
        }
        if (b == 1) {
            switch (c) {
                case 0:
                    System.out.print(" and ten");
                    break;
                case 1:
                    System.out.print(" and eleven");
                    break;
                case 2:
                    System.out.print(" and twelve");
                    break;
                case 3:
                    System.out.print(" and thirteen");
                    break;
                case 4:
                    System.out.print(" and fourteen");
                    break;
                case 5:
                    System.out.print(" and fifteen");
                    break;
                case 6:
                    System.out.print(" and sixteen");
                    break;
                case 7:
                    System.out.print(" and seventeen");
                    break;
                case 8:
                    System.out.print(" and eighteen");
                    break;
                case 9:
                    System.out.print(" and nineteen");
                    break;
            }
        } else {
            switch (c) {
                case 1:
                    System.out.print(" and one");
                    break;
                case 2:
                    System.out.print(" two");
                    break;
                case 3:
                    System.out.print(" three");
                    break;
                case 4:
                    System.out.print(" four");
                    break;
                case 5:
                    System.out.print(" five");
                    break;
                case 6:
                    System.out.print(" six");
                    break;
                case 7:
                    System.out.print(" seven");
                    break;
                case 8:
                    System.out.print(" eight");
                    break;
                case 9:
                    System.out.print(" nine");
                    break;
            }
        }
    }
}

