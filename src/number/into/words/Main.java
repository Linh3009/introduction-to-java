package number.into.words;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, a, b, c;

        System.out.println("Enter number: ");
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
            case 1 -> System.out.print("");
            case 2 -> System.out.print(" twenty");
            case 3 -> System.out.print(" thirty");
            case 4 -> System.out.print(" forty");
            case 5 -> System.out.print(" fifty");
            case 6 -> System.out.print(" sixty");
            case 7 -> System.out.print(" seventy");
            case 8 -> System.out.print(" eighty");
            case 9 -> System.out.print(" ninety");
        }
        if (b == 1) {
            switch (c) {
                case 0 -> System.out.print(" and ten");
                case 1 -> System.out.print(" and eleven");
                case 2 -> System.out.print(" and twelve");
                case 3 -> System.out.print(" and thirteen");
                case 4 -> System.out.print(" and fourteen");
                case 5 -> System.out.print(" and fifteen");
                case 6 -> System.out.print(" and sixteen");
                case 7 -> System.out.print(" and seventeen");
                case 8 -> System.out.print(" and eighteen");
                case 9 -> System.out.print(" and nineteen");
            }
        } else {
            switch (c) {
                case 1 -> System.out.print(" one");
                case 2 -> System.out.print(" two");
                case 3 -> System.out.print(" three");
                case 4 -> System.out.print(" four");
                case 5 -> System.out.print(" five");
                case 6 -> System.out.print(" six");
                case 7 -> System.out.print(" seven");
                case 8 -> System.out.print(" eight");
                case 9 -> System.out.print(" nine");
            }
        }
    }
}

