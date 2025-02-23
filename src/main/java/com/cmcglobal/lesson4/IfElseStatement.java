package com.cmcglobal.lesson4;

import java.util.Scanner;

public class IfElseStatement {
    public static Scanner scanner = new Scanner(System.in);

    public static void checkInteger() {
        System.out.println("Nhap so nguyen duong: ");
        try {
            int inputNumber = scanner.nextInt();
            if (inputNumber % 2 > 0) {
                System.out.println("So le!");
            } else {
                System.out.println("So chan");
            }
        } catch (Exception e) {
            System.out.println("Input phai la so nguyen duong!");
            scanner = new Scanner(System.in);
            checkInteger();
        }

    }

    public static void checkFloat() {
        System.out.println("Nhap so thuc duong: ");
        try {
            float inputNumber = scanner.nextFloat();
            if (inputNumber % 2 == 1) {
                System.out.println("So le!");
            } else if (inputNumber % 2 == 0) {
                System.out.println("So chan!");
            } else {
                System.out.println("Khong phai so tu nhien!");
            }
        } catch (Exception e) {
            System.out.println("Input phai la so thuc duong!");
            scanner = new Scanner(System.in);
            checkFloat();
        }
    }

    public static void categorizeScore() {
        try {
            System.out.println("Nhap so diem:");
            int score = scanner.nextInt();
            if (score > 89) {
                System.out.println("Loai A");
            } else if (score > 80 && score <= 89) {
                System.out.println("Loai B");
            } else if (score > 70 && score <= 79) {
                System.out.println("Loai C");
            } else if (score > 60 && score <= 69) {
                System.out.println("Loai D");
            } else {
                System.out.println("Loai F");
            }
        } catch (Exception e) {
            System.out.println("Input phai la so nguyen duong!");
            scanner = new Scanner(System.in);
            categorizeScore();
        }

    }

    public static void classifyScholarship() {
        try {
            System.out.println("Nhap so diem:");
            int score = scanner.nextInt();
            if (score > 89) {
                System.out.println(score > 95 ? "Duoc nhan hoc bong toan phan! " : "Duoc nhan hoc bong ban phan" + "\nLoai A");
            } else if (score > 80 && score <= 89) {
                System.out.println(score > 85 ? "Duoc nhan hoc bong ban phan! " : "" + "\nLoai B");
            } else if (score > 70 && score <= 79) {
                System.out.println("Khong duoc nhan hoc bong!");
                System.out.println("Loai C");
            } else if (score > 60 && score <= 69) {
                System.out.println("Khong duoc nhan hoc bong!");
                System.out.println("Loai D");
            } else {
                System.out.println("Khong duoc nhan hoc bong!");
                System.out.println("Loai F");
            }
        } catch (Exception e) {
            System.out.println("Input phai la so nguyen duong!");
            scanner = new Scanner(System.in);
            classifyScholarship();
        }

    }

    public static void main(String[] args) {
        //Kiem tra so nguyen duong
        checkInteger();
        // Kiem tra so thuc duong
        checkFloat();
        // Loai diem
        categorizeScore();
        // xep loai hoc bong
        classifyScholarship();
    }
}
