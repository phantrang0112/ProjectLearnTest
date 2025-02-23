package com.cmcglobal.lesson3;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap ten nguoi dung: ");
        String name = scanner.nextLine();
        System.out.println("Vui long nhap tuoi: ");
        int age = scanner.nextInt();
        System.out.println("Ten nguoi dung: " + name + "\nTrTuoi cua nguoi dung:" + age);

    }
}
