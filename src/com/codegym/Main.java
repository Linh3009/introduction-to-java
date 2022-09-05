package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in); //Khai báo đối tượng Scanner

        System.out.println("Enter width: ");
        width = sc.nextFloat(); //Nhập chiều rộng

        System.out.println("Enter height: "); //Nhập chiều dài
        height = sc.nextFloat();

        float area = width * height;

        System.out.println("area = " +area);
    }
}
