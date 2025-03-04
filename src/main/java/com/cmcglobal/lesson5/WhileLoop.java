package com.cmcglobal.lesson5;

import java.util.Scanner;

public class WhileLoop {
    public static Scanner scanner = new Scanner(System.in);

    public static int enterInt() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner = new Scanner(System.in);
            System.out.println("Input phải là số tự nhiên!");
            return enterInt();
        }
    }

    public boolean checkDivisible(int number, int demominator) {
        return number % demominator == 0;
    }

    public static void exercise1() {
        // loop with while
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }
        // loop with do while
        i = 0;
        do {
            i++;
            System.out.println(i);
        } while (i < 10);
    }

    public static int print(int i) {
        System.out.println(i);
        return i + 1;
    }

    public static void exercise2() {
        int i = 1;
        // don't use if
        while (i < 20) {
            i = (i % 2 == 0 ? print(i) : (i + 1));
        }
        // use if
        i = 1;
        while (i < 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void exercise3() {
        System.out.println("Các số từ 1-30 không chia hết cho 2 và cho 3:");
        for (int i = 0; i < 30; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void exercise4() {
        System.out.println("Mời bạn nhập số a:");
        int a = enterInt();
        System.out.println("Mời bạn nhập số b:");
        int b = enterInt();
        int i = 1;
        while (true) {
            if (i % a == 0 && i % b == 0 & i < 100) {
                System.out.println("Bội chung nhỏ nhất của a và b: " + i);
                break;
            } else if (i >= 100 && i % a == 0 && i % b == 0) {
                System.out.println("Bội chung nhỏ nhất đang lớn hơn 100: " + i);
                break;
            }
            i++;
        }
    }

    public static void exercise5() {
        String road = "--x---x--x-x--x--x";
        int hp = 3;
        for (int i = 0; i < road.length(); i++) {
            // Nếu mickey ở vị trí thứ 3 thì hp + 5
            if (i == 2) {
                hp += 5;
            }
            // Nếu mickey đi tới "-" thì hp -1
            if (road.charAt(i) == '-') {
                hp--;
                System.out.println("Mickey đi thêm 1 bước và mất 1 HP");

            }
            // Nếu Mickey đi tới 'x' thì hp -3
            else if (road.charAt(i) == 'x') {
                hp -= 2;
                System.out.println("Mickey đạp bom và mất 2hp");
            }
            // Nếu số hp đã hết Mickey dừng lại
            if (hp <= 0) {
                System.out.println("Michey dừng lại tại vị trí:" + (i + 1));
                break;
            }
            // Mickey đi tới bước cuối cùng và hp>0
            if (i == road.length() - 1 && hp > 0) {
                System.out.println("Chúc mừng mickey đã đi đến đích!");
            }
        }


    }

    public static void main(String[] args) {
        System.out.println("--------------------exercise1------------------------");
        exercise1();
        System.out.println("--------------------exercise2------------------------");
        exercise2();
        System.out.println("--------------------exercise3------------------------");
        exercise3();
        System.out.println("--------------------exercise4------------------------");
        exercise4();
        System.out.println("--------------------exercise5-----------------------");
        exercise5();
    }
}
