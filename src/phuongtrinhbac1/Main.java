package phuongtrinhbac1;

import java.util.Scanner;// sử dụng thư viện Scanner trong gói java.util
                        // để đọc giá trị mà người dùng nhập vào console (luồng in)

public class Main {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        Scanner sc = new Scanner(System.in); // sử dụng thư viện Scanner trong gói java.util
        // để đọc giá trị mà người dùng nhập vào console (luồng in)
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();

        System.out.println("Nhap b: ");
        double b = sc.nextDouble();

        System.out.println("Nhap c: ");
        double c = sc.nextDouble();

        if (a != 0) {
            double result = (c - b) / a;
            System.out.println("Phuong trinh co 1 nghiem duy nhat x = " + result);
        } else {
         if (b == c) {
                    System.out.println("Phuong trinh co vo so nghiem");
                }
         else {
             System.out.println("Phuong trinh vo nghiem");
         }
            }
        }
    }

