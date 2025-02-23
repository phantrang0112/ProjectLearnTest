package com.cmcglobal.lesson4;

public class ForLoop {

    public static void printNames() {
        String[] nameList = {"Trang", "Trang1", "Trang2", "Trang3"};
        System.out.println("Danh sach ten: ");
        for (String name : nameList) {
            System.out.println(name);
        }
    }

    public static void printNumbers() {
        System.out.println("Danh sach so tu 1-10:");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    public static void printIndexAndName() {
        String[] nameList = {"Trang", "Trang1", "Trang2", "Trang3"};
        System.out.println("Danh sach stt va ten:");
        for (int i = 0; i < nameList.length; i++) {
            System.out.println("STT:" + i + " Name:" + nameList[i]);
        }
    }

    public static void isNotDivisibleBy2and3() {
        System.out.println("Cac so khong chia het cho 2 va 3 trong khoang 1-30:");
        for (int i = 1; i < 31; i++) {
            if (i % 3 > 0 && i % 2 > 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // bai 1
        printNames();
        //bai 2
        printNumbers();
        //bai 3
        printIndexAndName();
        //bai4
        isNotDivisibleBy2and3();

    }
}
